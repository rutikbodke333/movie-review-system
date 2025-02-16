# Movie Review System  

![SpringBoot](https://img.shields.io/badge/SpringBoot-2.7-green)  
![MySQL](https://img.shields.io/badge/MySQL-Database-blue)  
![JPA](https://img.shields.io/badge/JPA-Hibernate-orange)  
![GitHub](https://img.shields.io/badge/GitHub-VersionControl-black)  
![Postman](https://img.shields.io/badge/Postman-API%20Testing-orange)  

## Be the Hero for Pranvi, the YouTube Reviewer  

### The Challenge  

Meet **Pranvi**, a passionate YouTube movie reviewer. She loves sharing her thoughts on the latest releases, but managing her growing collection of reviews has become overwhelming. Juggling notes, spreadsheets, and scattered comments from her subscribers, she struggles to stay organized.  

That's where **you** come in! As a **backend developer**, it's your mission to build a powerful **movie review system** that helps Pranvi streamline her workflow. With your expertise, she can finally focus on what she does best—**reviewing movies**—without worrying about data chaos.  

---

## Technologies Used  

- **Backend:** Spring Boot, JPA (Hibernate), RESTful APIs  
- **Database:** MySQL  
- **API Testing:** Postman  
- **Version Control:** Git & GitHub  

---

## Understanding the Data  

Pranvi needs **two key entities** in her system:  

### 🎬 Movies  
- **ID** (Unique identifier)  
- **Title**  
- **Genre**  
- **Release Year**  

### 📝 Reviews  
- **ID** (Unique identifier)  
- **Reviewer Name**  
- **Comment**  
- **Rating**  
- **Movie ID** (to associate with a movie)  

Since **Pranvi often updates** her opinions on movies, the system must support modifying existing reviews.  

---

## API Endpoints  

### 1️⃣ Get All Movies with Reviews  
📌 **Endpoint:** `GET /movies`  
📌 **Functionality:** Returns a list of movies along with their reviews.  
📌 **Tested with:** Postman  
📌 **Screenshot:**  
![Returns a list of movies along with their reviews](https://github.com/rutikbodke333/movie-review-system/blob/main/Returns%20a%20list%20of%20movies%20along%20with%20their%20reviews.png?raw=true)  

### 2️⃣ Add a Movie  
📌 **Endpoint:** `POST /movies`  
📌 **Functionality:** Accepts movie details and stores them in the database.  
📌 **Tested with:** Postman  
📌 **Screenshot:**  
![Accepts movie details and stores them](https://github.com/rutikbodke333/movie-review-system/blob/main/Accepts%20movie%20details%20and%20stores%20them%20in%20the%20database..png?raw=true)  

### 3️⃣ Add a Review for a Movie  
📌 **Endpoint:** `POST /movies/{movieId}/reviews`  
📌 **Functionality:** Accepts a review and associates it with a given movie.  
📌 **Tested with:** Postman  
📌 **Screenshot:**  
![Accepts a review and associates it](https://github.com/rutikbodke333/movie-review-system/blob/main/Accepts%20a%20review%20and%20associates%20it%20with%20a%20given%20movie.png?raw=true)  

### 4️⃣ Update a Review  
📌 **Endpoint:** `PUT /reviews/{reviewId}`  
📌 **Functionality:** Updates the review comment and rating.  
📌 **Tested with:** Postman  
📌 **Screenshot:**  
![Updates the review comment and rating](https://github.com/rutikbodke333/movie-review-system/blob/main/Updates%20the%20review%20comment%20and%20rating..png?raw=true)  

---

