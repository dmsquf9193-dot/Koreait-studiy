```markdown
# Design System Specification: The Ethereal Librarian

This design system is a comprehensive framework designed for a premium AI Book Recommendation Service. It moves away from the "industrial" feel of standard SaaS platforms, opting instead for an editorial, high-end experience that feels like a digital sanctuary for readers.

---

## 1. Creative North Star: The Digital Curator
The "Digital Curator" philosophy treats every recommendation not as a data output, but as a personalized suggestion from a sophisticated friend. The aesthetic breaks the traditional "app grid" by using intentional asymmetry, overlapping layers, and varying scales to mimic the feel of an avant-garde literary journal. 

**Key Principles:**
*   **Weightless Depth:** Objects should feel like they are floating in a soft, atmospheric space rather than being "stuck" to a screen.
*   **Intentional Asymmetry:** Break the monotony by shifting content slightly off-center or using staggered layouts to guide the eye through the narrative of the page.
*   **Bespoke Softness:** Every interaction should feel fluid and gentle, avoiding sharp transitions or harsh containers.

---

## 2. Colors: Tonal Atmosphere
The palette is built on a sophisticated interplay of soft light blues (`primary`) and muted purples (`secondary`). These colors are used to create a "dreamlike" reading environment that reduces eye strain and encourages exploration.

### The "No-Line" Rule
**Lines are a failure of layout.** To maintain a premium, modern feel, designers are prohibited from using 1px solid borders to define sections. Instead:
*   **Structural Shifts:** Define areas through background color shifts. For example, a `surface-container-low` section sitting directly on a `background` base.
*   **The Glass & Gradient Rule:** For hero sections or primary CTAs, use a subtle linear gradient transitioning from `primary` to `primary-container`. This provides "soul" and depth.
*   **Glassmorphism:** Use `surface-container-lowest` with a 60-80% opacity and a `20px` backdrop-blur for floating navigation or hovering cards.

### Surface Hierarchy
*   **Base:** `background` (#fbf8fe)
*   **Level 1 (Subtle Recession):** `surface-container-low` (#f5f2fb)
*   **Level 2 (Active Cards):** `surface-container` (#efedf6)
*   **Level 3 (Floating/Highlighted):** `surface-container-highest` (#e2e1ed)

---

## 3. Typography: Editorial Authority
The typography system uses a pairing of **Plus Jakarta Sans** for expressive, high-contrast headings and **Manrope** for highly legible, functional body text.

*   **Display (Plus Jakarta Sans):** Used for "Big AI Moments"—capturing the user's attention during book reveals. Use `display-lg` with a slight negative letter-spacing (-0.02em) to feel custom-made.
*   **Headlines (Plus Jakarta Sans):** Used for section titles. `headline-md` provides a bold, authoritative voice.
*   **Titles & Body (Manrope):** `title-md` is used for book titles. `body-lg` is the workhorse for book descriptions, ensuring long-form readability.
*   **Labels (Manrope):** Use `label-md` for meta-data (e.g., "Genre," "Reading Time") to keep the UI lightweight and secondary to the literary content.

---

## 4. Elevation & Depth: Tonal Layering
We do not use shadows to create "pop"; we use them to create "atmosphere."

*   **The Layering Principle:** Depth is achieved by stacking. Place a `surface-container-lowest` card on top of a `surface-container-low` background. The subtle shift in hex value creates a natural, soft lift.
*   **Ambient Shadows:** For floating elements (like the "AI Chat" bubble), use an extra-diffused shadow. 
    *   *Spec:* `0px 12px 32px rgba(49, 50, 59, 0.06)` (Using the `on-surface` color for the shadow tint).
*   **The Ghost Border Fallback:** If a border is required for accessibility, use the `outline-variant` token at **15% opacity**. Never use 100% opaque lines.

---

## 5. Components: Bespoke Elements

### Cards (The "Book Jacket" Component)
*   **Structure:** No borders. Use `surface-container-lowest` as the base.
*   **Rounding:** Apply `DEFAULT` (1rem) or `md` (1.5rem) corners.
*   **Layout:** Use the "Spacing Scale" (32px vertical gaps) instead of divider lines to separate title from metadata.

### Buttons
*   **Primary:** A gradient-filled container (`primary` to `primary-dim`) with `on-primary` text. Corners: `full`.
*   **Secondary:** A `surface-container-high` background with `on-secondary-container` text. This feels integrated into the UI rather than separate.
*   **Tertiary:** Text-only using `primary` color. No container. High-end, minimal footprint.

### Input Fields (The "Curator's Search")
*   **State:** Default state uses `surface-container-low`.
*   **Focus State:** Shifts to `surface-container-lowest` with a soft `primary` glow (2px blur).
*   **Corner:** `DEFAULT` (1rem).

### Progress Indicators (AI "Thinking" State)
*   Instead of a standard spinner, use a soft, pulsing gradient blob using `primary-container` and `secondary-container` with a high-degree blur.

---

## 6. Do’s and Don’ts

### Do:
*   **Use Whitespace as a Tool:** Give every book recommendation "room to breathe." If a screen feels crowded, increase the spacing rather than adding a box.
*   **Use Tonal Shifts:** Always ask, "Can I define this area with a background color rather than a line?"
*   **Embrace the Rounding:** Use the `xl` (3rem) rounding for large interactive containers to maintain the "beginner-friendly" softness.

### Don’t:
*   **Don't use pure black:** Use `on-background` (#31323b) for text to maintain the soft, premium feel.
*   **Don't use Dividers:** Avoid horizontal `<hr>` tags. Vertical whitespace and background shifts are the only permitted separators.
*   **Don't use harsh shadows:** If the shadow looks like a shadow, it’s too dark. It should look like a soft glow of light.
*   **Don't use default grids:** Occasionally break the grid. Let a book cover overlap the edge of a container to create a sense of physical layering.

---

## 7. Roundedness & Spacing Scale
*   **Micro (Buttons/Chips):** `sm` (0.5rem)
*   **Standard (Cards/Inputs):** `DEFAULT` (1rem)
*   **Large (Hero/Modals):** `md` (1.5rem) to `xl` (3rem)
*   **Pills:** `full` (9999px)

This system is designed to be living and breathing. When in doubt, prioritize **readability** and **tranquility** over density.```