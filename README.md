# ResponsiveUI

Учебный Android-проект — список карточек видео-постов в стиле YouTube/соцсети.

## Что внутри

`RecyclerView` со списком постов. Каждая карточка содержит:

- Круглый аватар + имя канала + источник и просмотры + закладка
- Заголовок поста
- Превью-изображение (полное, без обрезки)
- Теги с выделенной категорией (жёлтый pill-чип) и стрелка
- Панель действий: лайки, репосты, поделиться

## Архитектура

- `VideoPost` — data class с полями поста
- `VideoPostAdapter` — `RecyclerView.Adapter`, биндит данные в `item_video_post.xml`
- `MainActivity` — создаёт список постов и подключает адаптер

## Стек

- **Language:** Kotlin
- **Min SDK:** 24
- **Compile SDK:** 36.1
- **UI:** XML layouts, ConstraintLayout, Material3
- **Компоненты:** `RecyclerView`, `ShapeableImageView`, `LinearLayout`
