# 🚀 OMNI_WEBSITE

---

<a href="https://danbaz7.github.io/Omni_website" target="_blank" style="display:inline-block; background:#7ed56f; color:#111; padding:0.7em 2em; border-radius:2em; font-weight:bold; text-decoration:none; font-size:1.1em; border:2px solid #28b485;">🌐 View Website &rarr;</a>

Welcome to **Omni_WEBSITE** — a 💻 modern, fully responsive website built with semantic HTML5 and advanced CSS3. This project follows best practices in web design 🎨, accessibility ♿, and maintainability 🛠️ while keeping things clean and visually engaging 🤩. JavaScript is only used to render icons via the Ionicons library 🧩 — all other interactivity is pure HTML/CSS magic ✨.

---

## 🧱 Semantic HTML Elements Used

- 🧭 `<header>`: Site logo + main navigation
- 📌 `<nav>`: Navigation links
- 📑 `<main>`: Primary content wrapper
- 🧵 `<section>`: Logical page divisions (hero, meals, snippets, testimonials, pricing, features, CTA, footer)
- 💬 `<aside>`: Extra details like plan info
- 📰 `<article>`: Testimonials and independent blocks
- 🏁 `<footer>`: Site footer links + copyright
- 📋 `<ul>`, `<li>`: Lists for navigation, features, pricing
- 📝 `<form>`, `<input>`, `<select>`, `<label>`: CTA subscription
- 🖼️ `<img>`: All images across meals, avatars, gallery
- 🔤 `<span>`, `<strong>`, `<p>`, `<h1>`…: Text & headings

---

## 🎨 CSS & Modern Features

### 📐 Layout & Responsiveness

- 🔲 **CSS Grid**  
  Multi-column magic for sections like meals & pricing

  ```css
  .meals-grid {
    display: grid;
    grid-template-columns: repeat(3, 1fr);
    gap: 4.8rem;
  }
  ```

📦 Flexbox Flexible alignment for nav, features, and footer

```css
.footer-flex {
  display: flex;
  column-gap: 8rem;
}
```

📱 ### Media Queries

- Adapts beautifully to screens above 700px.

### Visual Styles

- **🧪 Custom Color Palette**:  
  Consistent use of brand colors, gradients, and background shades for visual hierarchy and appeal.

- **✍️ Typography**:  
  Google Fonts (Rubik) for modern, readable text.  
  Font sizes and weights are set using `rem` units for scalability.

- **🟢 Buttons & Links**:  
  Styled with transitions, border-radius, and color changes on hover/active states for interactivity.

- **🧾Cards & Shadows**:  
  Meal and pricing items use box-shadows and border-radius for a modern card look.

- **🧠 Icons**:  
  Ionicons are used for visual cues in features, lists, and navigation (the only JavaScript dependency).

- **🔮 Pseudo-elements**:  
  Decorative circles and backgrounds are created using `::before` and `::after` for layered effects.

- **🖼️ Gallery & Images**:  
  Responsive images with hover effects (e.g., scale on hover in the gallery).

### ✅ Accessibility & Best Practices

- **Semantic Structure**:  
  All content is wrapped in appropriate HTML5 elements for accessibility and SEO.

- **Contrast & Readability**:  
  Careful color choices and font sizes ensure content is easy to read.

- **Keyboard Focus**:  
  Custom focus styles for form elements and links improve usability.

---

## 📁 Folder Structure

```
OMNI_WEBSITE/
├── index.html
├── styles.css
├── img/
│   ├── meals/
│   ├── gallery/
│   └── eating.jpg
└── README.md
```

---

##⚙️ JavaScript Usage

- **Icons Only**:  
  JavaScript is used solely to load Ionicons for scalable, customizable icons throughout the site. No other JavaScript is present; all layout, animation, and interactivity are handled with CSS.

---

## 🌍 Responsiveness

- Screen-friendly for 📱 tablets, 💻 laptops, and 🖥️ desktops**700px and above**.
- Powered by CSS Grid + Flexbox to ensure smooth adaptability 🔄

---

## ✅ Summary

Omni_WEBSITE is your showcase of modern frontend design 🌐. Built on semantic HTML5 and clean CSS3, it nails responsiveness 📏, accessibility 💬, and elegant structure 🔧—all while staying JS-light ⚡. Hero, meals, snippets, testimonials, pricing, features, CTA, and footer—all organized with care and built for impact 💥.

---

###### 👨‍💻 Crafted with pride by Daniel Obazee.
