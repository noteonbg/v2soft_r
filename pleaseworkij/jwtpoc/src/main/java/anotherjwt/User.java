package anotherjwt;


	
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

	@Table(name = "userstry")
	@Entity
	public class User implements UserDetails {
	    @Override
		public String toString() {
			return "User [id=" + id + ", fullName=" + fullName + ", email=" + email + ", password=" + password
					+ ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + "]";
		}

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		@Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    @Column(nullable = false)
	    private Integer id;

	    @Column(nullable = false)
	    private String fullName;

	    @Column(unique = true, length = 100, nullable = false)
	    private String email;

	    @Column(nullable = false)
	    private String password;

	    @CreationTimestamp
	    @Column(updatable = false, name = "created_at")
	    private Date createdAt;

	    @UpdateTimestamp
	    @Column(name = "updated_at")
	    private Date updatedAt;

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getFullName() {
			return fullName;
		}

		public void setFullName(String fullName) {
			this.fullName = fullName;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public Date getCreatedAt() {
			return createdAt;
		}

		public void setCreatedAt(Date createdAt) {
			this.createdAt = createdAt;
		}

		public Date getUpdatedAt() {
			return updatedAt;
		}

		public void setUpdatedAt(Date updatedAt) {
			this.updatedAt = updatedAt;
		}

		@Override
		public Collection<? extends GrantedAuthority> getAuthorities() {
			// roles.. Admin, user.. moderator
			return new ArrayList<>();
		}

		@Override
		public String getUsername() {
			// TODO Auto-generated method stub
			return getEmail();
		}

	 
	}


