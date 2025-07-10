# OMNI_WEBSITE

The **Omni_WEBSITE** project is a modern, fully responsive website built primarily with semantic HTML5 and advanced CSS3. The site demonstrates best practices in web design, accessibility, and maintainability, with a focus on clean structure and visually engaging layouts. JavaScript is only used for rendering icons via the Ionicons library; all other functionality and interactivity are achieved with HTML and CSS.

---

## Semantic HTML Elements Used

- `<header>`: Contains the site logo and main navigation.
- `<nav>`: Houses the navigation links for easy site-wide access.
- `<main>`: Wraps the primary content of each page.
- `<section>`: Used to logically divide the site into meaningful content blocks (hero, meals, snippets, testimonials, pricing, features, CTA, footer).
- `<aside>`: Provides additional context or details, such as plan information.
- `<article>`: Used for self-contained content, such as testimonials.
- `<footer>`: Contains site-wide footer information, links, and copyright.
- `<ul>`, `<li>`: For all lists, including navigation, features, and pricing details.
- `<form>`, `<input>`, `<select>`, `<label>`: For the call-to-action (CTA) subscription form.
- `<img>`: For all images, including meals, customer avatars, and gallery items.
- `<span>`, `<strong>`, `<p>`, `<h1>`, `<h2>`, `<h3>`: For inline and block-level text content and headings.

---

## CSS & Modern Features

### Layout & Responsiveness

- **CSS Grid**:  
  Used extensively for multi-column layouts (e.g., hero, meals, testimonials, pricing, CTA, gallery).  
  Example:

  ```css
  .meals-grid {
    display: grid;
    grid-template-columns: repeat(3, 1fr);
    gap: 4.8rem;
  }
  ```

- **Flexbox**:  
  Used for horizontal and vertical alignment, navigation, feature sections, and footer.  
  Example:

  ```css
  .footer-flex {
    display: flex;
    column-gap: 8rem;
  }
  ```

- **Media Queries**:  
  The website is fully responsive for screen resolutions 700px and above, with layouts and font sizes adapting for larger screens.

### Visual Styles

- **Custom Color Palette**:  
  Consistent use of brand colors, gradients, and background shades for visual hierarchy and appeal.

- **Typography**:  
  Google Fonts (Rubik) for modern, readable text.  
  Font sizes and weights are set using `rem` units for scalability.

- **Buttons & Links**:  
  Styled with transitions, border-radius, and color changes on hover/active states for interactivity.

- **Cards & Shadows**:  
  Meal and pricing items use box-shadows and border-radius for a modern card look.

- **Icons**:  
  Ionicons are used for visual cues in features, lists, and navigation (the only JavaScript dependency).

- **Pseudo-elements**:  
  Decorative circles and backgrounds are created using `::before` and `::after` for layered effects.

- **Gallery & Images**:  
  Responsive images with hover effects (e.g., scale on hover in the gallery).

### Accessibility & Best Practices

- **Semantic Structure**:  
  All content is wrapped in appropriate HTML5 elements for accessibility and SEO.

- **Contrast & Readability**:  
  Careful color choices and font sizes ensure content is easy to read.

- **Keyboard Focus**:  
  Custom focus styles for form elements and links improve usability.

---

## Folder Structure

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

## JavaScript Usage

- **Icons Only**:  
  JavaScript is used solely to load Ionicons for scalable, customizable icons throughout the site. No other JavaScript is present; all layout, animation, and interactivity are handled with CSS.

---

## Responsiveness

- The website is designed to be fully responsive for screen resolutions of **700px and above**.
- CSS Grid and Flexbox ensure that all sections adapt smoothly to different screen sizes, maintaining usability and visual appeal on desktops, laptops, and large tablets.

---

## Summary

The Omni_WEBSITE project showcases a modern approach to web development using semantic HTML5 and advanced CSS3. With a focus on accessibility, responsiveness, and maintainability, the site delivers a polished user experience with minimal reliance on JavaScript. All major sections—hero, meals, snippets, testimonials, pricing, features, CTA, and footer—are thoughtfully structured and styled for clarity and engagement.

---
