# AI Email Assistant

A full-stack **AI-powered email reply generator** with **Google Mail extension** integration, built with a **Spring Boot** backend and **React + Vite** frontend.

---

## 🚀 Demo

> *(Replace with your actual screenshots)*

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

- 🔗 **Web Application**: *[Link goes here]*  
- 📦 **Extension Download**: *(when available)*

---

## 📸 Screenshots

> *(Replace with your actual screenshots)*

- ✅ Web Interface  
- ✅ Gmail Extension  
- ✅ Sample Reply Example  

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
| Extension | Chrome Web Store    *(coming soon)*        |

---

## 📬 Contact

- 📧 **Email**: [chamansinha9480@gmail.com](mailto:chamansinha9480@gmail.com)
- 🌐 **Portfolio**: [Chaman Sinha](https://your-portfolio-link.com) <!-- Replace with your actual link -->
- 🐙 **GitHub**: [@Kvr-10](https://github.com/Kvr-10)

                                    

