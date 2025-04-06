# AI Email Assistant

A full-stack **AI-powered email reply generator** with **Google Mail extension** integration, built with a **Spring Boot** backend and **React + Vite** frontend.

---

## 🚀 Demo

> **🎥 Click to watch the demo:**  
<p align="center">
  <a href="https://www.youtube.com/watch?v=GhceCjThWqo" target="_blank">
    <img src="docs/images/frontend.png" alt="Watch the demo" style="width: 80%; max-width: 600px;" />
  </a>
</p>

---

## ✨ Features

- 🤖 **AI Email Generation**: Generate context-aware email replies using AI  
- 🎭 **Tone Customization**: Select from *professional*, *casual*, or *friendly* tones  
- 📧 **Google Mail Integration**: Browser extension adds an **"AI Reply"** button directly in Gmail  
- 🖥️ **Responsive Web Interface**: Clean, modern UI built with **Material-UI**  
- 📋 **Clipboard Integration**: One-click copy of generated replies  

---

## 🛠️ Technologies Used

### Backend

- **Spring Boot (Java)**
- **REST API**
- **Render** (Hosting)

### Frontend

- **React (Vite)**
- **Material-UI (MUI)**
- **Axios**
- **Netlify** (Hosting)

### Extension

- **Chrome Extension API**
- **Google Mail API** integration

### DevOps & Deployment

- **CI/CD**: GitHub Actions  
- **Containerization**: Docker  
- **Hosting**:
  - Backend: [Render](https://render.com)  
  - Frontend: [Netlify](https://www.netlify.com)  

---

## 🌐 Live Demo

- 🔗 **[Web Application](https://aiemail-assistant-kvr10.netlify.app/)**
- 🔗 **[Backend URL](https://aiemail-backend.onrender.com)**
- 📦 **Extension Download**: *(comming soon!)*
  
> **Note**: The backend service on Render may take ~50 seconds to respond on first request due to cold start.

---

## 📸 Screenshots

<p align="center">
  <img src="docs/images/frontend.png" alt="Web Interface" width="70%" /><br>
  <strong>🌐 Web Interface</strong>
</p>

<p align="center">
  <img src="docs/images/frontend_reply.png" alt="Gmail Extension" width="70%" /><br>
  <strong>💬 Sample Reply Example</strong>
</p>

<p align="center">
  <img src="docs/images/gmail.png" alt="Gmail Extension" width="70%" /><br>
  <img src="docs/images/gmail_reply.png" alt="Gmail Reply" width="70%" /><br>
  <strong>📬 Gmail Extension</strong>
</p>


---

## ⚙️ Installation

### Prerequisites

- Java JDK 17+  
- Node.js 16+  
- Maven  
- npm  

---

## 🔧 Backend Setup

```bash
git clone https://github.com/your-username/AIEmail-Assistant.git
cd AIEmail-Assistant/backend
```

---

## 🔐 Configure environment variables:
```bash
# Create application.properties file
echo "OPENAI_API_KEY=your-api-key" >> src/main/resources/application.properties
```

---

## 🛠️ Build and run 
```bash
mvn clean install
mvn spring-boot:run
```

---

## 🌐 Frontend Setup
```bash
cd ../frontend
npm install
npm run dev
```

---

## 🧩 Extension Setup
```bash
cd ../extension
npm install
npm run build
```
Then load the unpacked extension in Chrome via chrome://extensions.

---

## 📡 API Endpoints
| Method | Endpoint               | Description             |
|--------|------------------------|-------------------------|
|GET	   | /	                    | Health check            | 
|POST	   | /api/email/generate    | Generate AI email reply |

---

## 📥 Request Body:
```json
{
  "emailContent": "original email text",
  "tone": "professional/casual/friendly"
}
```

---

## 🚀 Deployment

| Component | Service             |
|-----------|---------------------|
| Frontend  | [Netlify](https://www.netlify.com)         |
| Backend   | [Render](https://render.com)               |
| Extension | Chrome Web Store    *(coming soon!)*       |

---

## 📬 Contact

- 📧 **Email**: [chamansinha9480@gmail.com](mailto:chamansinha9480@gmail.com)
- 🌐 **Portfolio**: [Chaman Sinha](https://kvr-10.github.io/) 
- 🐙 **GitHub**: [@Kvr-10](https://github.com/Kvr-10)

                                    

