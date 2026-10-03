# Enterprise RAG API Prototype

A small Spring Boot API prototype for experimenting with a RAG service boundary.

## Current behavior

`GET /api/rag/query?q=...` returns the deterministic string `Answer: ...`. It does not retrieve documents, generate embeddings, call an LLM, or provide grounded answers yet. The current security configuration is permissive and is for local demonstration only.

## Run locally

Requires Java 17 and Maven 3.9+.

```bash
mvn spring-boot:run
```

The Swagger UI is available at `http://localhost:8080/swagger-ui.html`.

## Test and build

```bash
mvn clean verify
docker compose up --build
```

Tests cover application startup and the current query endpoint response.
