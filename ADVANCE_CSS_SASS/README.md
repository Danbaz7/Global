🌐[View Website](https://danbaz7.github.io/Natours_website)

# 🎯 ADVANCE_CSS_SASS

The **ADVANCE_CSS_SASS** folder contains the full Natours project, built as a showcase of advanced CSS and SCSS (Sass) techniques. This project demonstrates how to structure, organize, and maintain a large-scale, modern, responsive website using the latest CSS features and best practices.

---

## 🗂️ Project Structure

```
ADVANCE_CSS_SASS/
├── css/
│   ├── icon-font.css
│   └── style.css
├── img/
│   └── ... (all images and icons)
├── sass/
│   ├── abstracts/
│   │   ├── _functions.scss
│   │   ├── _mixins.scss
│   │   └── _variables.scss
│   ├── base/
│   │   ├── _animations.scss
│   │   ├── _base.scss
│   │   ├── _typography.scss
│   │   └── _utilities.scss
│   ├── components/
│   │   ├── _button.scss
│   │   ├── _card.scss
│   │   ├── _composition.scss
│   │   ├── _feature-box.scss
│   │   ├── _story.scss
│   │   ├── _bg-video.scss
│   │   └── _form.scss
│   ├── layout/
│   │   ├── _footer.scss
│   │   ├── _grid.scss
│   │   ├── _header.scss
│   │   └── _navigation.scss
│   ├── pages/
│   │   └── _home.scss
│   └── main.scss
├── index.html
└── package.json
```

---

---

## ⚙️ Advanced Features & Techniques

### 🧱 SCSS Architecture

- **7-1 Pattern:**  
  The project uses the 7-1 architecture, splitting SCSS into folders for abstracts, base, components, layout, and pages, making the codebase modular and maintainable.
- **Partials & Imports:**  
  All SCSS files are partials (prefixed with `_`) and imported into `main.scss` for a single, compiled CSS output.

### 🧮 Variables, Mixins, and Functions

- **Variables:**  
  Centralized color, font, and spacing variables in `abstracts/_variables.scss` for easy theme management.
- **Mixins:**  
  Reusable code blocks for media queries, gradients, and vendor prefixes in `abstracts/_mixins.scss`.
- **Functions:**  
  Custom SCSS functions for calculations and color manipulations in `abstracts/_functions.scss`.

### 📱 Responsive Design

- **Custom Grid System:**  
  Built with floats and percentage-based columns (`col-1-of-2`, `col-1-of-3`, etc.), not Flexbox or CSS Grid, for maximum browser compatibility.
- **Media Queries:**  
  Advanced, inline media queries using SCSS mixins and `$breakpoint` variables, applied primarily in the layout partials (`header`, `footer`, `grid`, `navigation`).  
  **Responsiveness starts at 444px and above.**
- **Mobile Navigation:**  
  Hamburger menu with animated transitions for mobile devices.

### 💡 Modern CSS Properties

- **clip-path:**  
  Used for creative header backgrounds and section shapes.
- **background-blend-mode:**  
  Blends gradients and images for visually rich backgrounds.
- **box-decoration-break:**  
  Ensures gradient backgrounds on multi-line headings remain seamless.
- **backface-visibility & perspective:**  
  Enable 3D card flip animations in the tours section.
- **Transitions & Animations:**  
  Custom keyframe animations for headings, buttons, and interactive elements.

### 🎨 Component-Based Styling

- **Buttons:**  
  Multiple button styles (`btn--white`, `btn--green`, `btn--animated`) with transitions and entrance animations.
- **Cards:**  
  3D flip cards with gradient backgrounds, shadow effects, and smooth transitions.
- **Feature Boxes:**  
  Icon-based feature highlights with gradients and hover effects.
- **Composition Images:**  
  Overlapping, interactive images with absolute positioning and hover scaling.
- **Forms:**  
  Custom-styled forms with floating labels, radio buttons, and responsive layouts.
- **Stories:**  
  Testimonial section with circular images, gradients, and background video overlays.
- **Popup Modal:**  
  Fully styled popup for booking with overlay and close functionality.

### 🧰 Utility Classes

- **Spacing:**  
  Utility classes for margin and text alignment (e.g., `u-margin-bottom-big`, `u-center-text`).
- **Typography:**  
  Consistent heading and paragraph styles for a cohesive look.

### 🧑‍🦯 Accessibility & Best Practices

- **Semantic HTML:**  
  Proper use of headings, lists, forms, and navigation for accessibility and SEO.
- **Alt Text:**  
  All images include descriptive `alt` attributes.
- **Keyboard Navigation:**  
  Interactive elements are accessible via keyboard.

---

## 🔧 How to Use

1. **Install dependencies (for SCSS compilation):**
   ```sh
   npm install
   ```

<a href="https://danbaz7.github.io/Natours_website" target="_blank" style="display:inline-block; background:#7ed56f; color:#111; padding:0.7em 2em; border-radius:2em; font-weight:bold; text-decoration:none; font-size:1.1em; border:2px solid #28b485;">View Website &rarr;</a>

---

## 🏆 Credits

- Design and original course by Jonas Schmedtmann.
- Project structure, SCSS architecture, and additional documentation by Daniel Obazee.

---
