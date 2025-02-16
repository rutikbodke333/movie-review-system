# Movie Review System  

![SpringBoot](https://img.shields.io/badge/SpringBoot-2.7-green)  
![MySQL](https://img.shields.io/badge/MySQL-Database-blue)  
![JPA](https://img.shields.io/badge/JPA-Hibernate-orange)  
![Swagger](https://img.shields.io/badge/Swagger-UI-yellow)  
![GitHub](https://img.shields.io/badge/GitHub-VersionControl-black)  

## Be the Hero for Pranvi, the YouTube Reviewer  

### The Challenge  

Meet **Pranvi**, a passionate YouTube movie reviewer. She loves sharing her thoughts on the latest releases, but managing her growing collection of reviews has become overwhelming. Juggling notes, spreadsheets, and scattered comments from her subscribers, she struggles to stay organized.  

That's where **you** come in! As a **backend developer**, it's your mission to build a powerful **movie review system** that helps Pranvi streamline her workflow. With your expertise, she can finally focus on what she does best—**reviewing movies**—without worrying about data chaos.  

---

## Technologies Used  

- **Backend:** Spring Boot, JPA (Hibernate), RESTful APIs  
- **Database:** MySQL  
- **API Documentation:** Swagger UI  
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
📌 **Screenshot:**  
![Returns a list of movies along with their reviews](./Returns_a_list_of_movies.png)  

### 2️⃣ Add a Movie  
📌 **Endpoint:** `POST /movies`  
📌 **Functionality:** Accepts movie details and stores them in the database.  
📌 **Screenshot:**  
![Accepts movie details and stores them](./Accepts_movie_details.png)  

### 3️⃣ Add a Review for a Movie  
📌 **Endpoint:** `POST /movies/{movieId}/reviews`  
📌 **Functionality:** Accepts a review and associates it with a given movie.  
📌 **Screenshot:**  
![Accepts a review and associates it](./Accepts_a_review.png)  

### 4️⃣ Update a Review  
📌 **Endpoint:** `PUT /reviews/{reviewId}`  
📌 **Functionality:** Updates the review comment and rating.  
📌 **Screenshot:**  
![Updates the review comment and rating](./Updates_the_review.png)  

---

## Completing the Task  

Now that you have a plan, it's time to **make it happen**:  

✅ **Build the APIs** that will power Pranvi’s movie review system.  
✅ **Push your code** to a **GitHub repository**.  
✅ **Submit the repository URL** in the provided textbox.  

With your solution in place, **Pranvi can efficiently manage her reviews, engage with her audience, and grow her YouTube channel.**  

Will **you** rise to the challenge and be the **hero** she needs? 🚀🎥  
