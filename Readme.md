# 🧠 MCP Server with LangChain4j + Ollama (Java + Spring Boot)

This project is a minimal **Model-Context-Prompt (MCP) Server** built using **Java Spring Boot**, which:
- Fetches data from an in-memory database (H2)
- Accepts user prompts via REST API
- Uses **LangChain4j** to interface with **local LLMs (e.g., phi, mistral)** via **Ollama**
- Provides insights/responses using a lightweight agent-based architecture

---

## 🚀 Features

- ✅ Spring Boot 3.x project
- ✅ REST endpoint `/api/chat` (attached postman request)
- ✅ Integrated with [LangChain4j](https://github.com/langchain4j/langchain4j)
- ✅ Supports local LLMs via [Ollama](https://ollama.com/)
- ✅ In-memory H2 database + optional SQL queries
- ✅ Built-in timeout handling

---

## 🧱 Tech Stack

| Layer       | Tool           |
|-------------|----------------|
| Language    | Java 17+       |
| Framework   | Spring Boot    |
| LLM Bridge  | LangChain4j    |
| LLM Runtime | Ollama (phi) |
| Database    | H2 (in-memory) |
| Build Tool  | Maven    |

---

## 🛠️ Setup Instructions

### 1. Clone the Repo
```bash
git clone https://github.com/yourusername/mcp-server.git
cd mcp-server
```
### 2. Run Ollama LLM Locally
```bash
ollama serve
ollama pull phi
ollama run phi
```
### 3. Start Spring Boot App
```bash
./mvnw spring-boot:run
```