# First Job Application

A simple Spring Boot REST API for managing job listings.

## Features

- List all jobs
- Create a job
- Find a job by ID
- Delete a job by ID

## Requirements

- Java 21
- Maven Wrapper

## Run the application

On Windows:

```powershell
.\mvnw.cmd spring-boot:run
```

The application starts on the default Spring Boot port:

```text
http://localhost:8080
```

## API endpoints

| Method | Endpoint | Description |
|---|---|---|
| GET | `/jobs` | Get all jobs |
| POST | `/jobs` | Create a job |
| GET | `/jobs/{id}` | Get a job by ID |
| DELETE | `/jobs/{id}` | Delete a job by ID |

Example request body for `POST /jobs`:

```json
{
  "title": "Java Developer",
  "descrption": "Develop Spring Boot applications",
  "minSalary": "50000",
  "maxSalary": "80000",
  "location": "Remote"
}
```

## Run tests

```powershell
.\mvnw.cmd test
```

## Git setup

Run these commands from the project root:

```powershell
git init
git add .
git commit -m "Initial commit"
```

To connect the local repository to GitHub, create an empty repository on GitHub first, then run:

```powershell
git branch -M main
git remote add origin https://github.com/<your-username>/<your-repository>.git
git push -u origin main
```
