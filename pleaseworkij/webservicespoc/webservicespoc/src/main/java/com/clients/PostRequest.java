package com.clients;

class PostRequest {
    private String title;
    private String body;

    // Constructor, Getters, Setters
    public PostRequest(String title, String body) {
        this.title = title;
        this.body = body;
    }

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

    // Getters and setters omitted for brevity
}