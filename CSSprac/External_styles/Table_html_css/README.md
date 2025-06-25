# Table HTML & CSS Example

This project demonstrates a comprehensive approach to building and styling responsive HTML tables using modern CSS techniques. The folder includes a fully styled table example, responsive navigation, and a print stylesheet to ensure the page remains clean and readable when printed.

## Features

### Responsive Table Design

- **Mobile-First Approach:**  
  The table is styled to be readable and usable on mobile screens upwards. Media queries adjust the table’s width, padding, and font sizes for different screen sizes, ensuring content is never clipped or unreadable.
- **Adaptive Widths:**  
  The table automatically expands from a compact mobile layout to wider, more detailed views on tablets and desktops.
- **Alternating Row Colors:**  
  Zebra striping (`tr:nth-last-of-type(odd)`) improves readability, especially on larger tables.

### Responsive Navigation

- **Mobile & Desktop Navigation:**  
  The navigation bar is hidden or stacked vertically on smaller screens and switches to a horizontal flex layout on larger screens (using media queries and flexbox).
- **Consistent Styling:**  
  Navigation links are styled for clarity and accessibility, with hover and visited states for better user feedback.
- **Semantic Structure:**  
  Navigation uses `<nav>` and `<ul>` elements for accessibility and SEO.

### Print Styles

- **Print CSS:**  
  A dedicated print stylesheet ensures the table and page content print cleanly, removing unnecessary images, backgrounds, and large font sizes that are unsuitable for paper.
- **Optimized Layout:**  
  The print view focuses on content, stripping away decorative elements and ensuring the table fits well on standard paper sizes.

### Additional Styling & Layout

- **Modern CSS:**  
  Uses CSS Grid and Flexbox for layout, gradients for backgrounds, and custom fonts for a polished look.
- **Semantic HTML:**  
  All content is structured with semantic tags (`<header>`, `<nav>`, `<main>`, `<footer>`, `<table>`, etc.) for accessibility and maintainability.
- **Visual Hierarchy:**  
  Headings, navigation, and table elements are styled to create a clear visual hierarchy and improve user experience.
- **Custom Gradients & Shadows:**  
  Gradients and subtle box-shadows add depth and modern aesthetics to the layout.

## File Structure

```
Table_html_css/
├── index.html
├── sportprint.css
└── (images, if any)
```

## Development Notes

- **Attention to Detail:**  
  Special care was taken to ensure the table and navigation are both visually appealing and highly functional across all devices.
- **Accessibility:**  
  Color contrast, font choices, and semantic markup were prioritized for accessibility.
- **Maintainability:**  
  The CSS is modular and organized, making it easy to update or extend styles as needed.

## How to Use

1. Open `index.html` in your browser to view the responsive table and navigation.
2. Resize your browser window or view on different devices to see the responsive behavior.
3. Use the browser’s print function to preview or print the page, and observe the optimized print layout.

---

This project serves as a robust example of how to create responsive, accessible, and print-friendly tables and navigation using only HTML and CSS.
