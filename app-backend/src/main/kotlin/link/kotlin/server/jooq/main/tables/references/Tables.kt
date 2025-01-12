/*
 * This file is generated by jOOQ.
 */
package link.kotlin.server.jooq.main.tables.references


import link.kotlin.server.jooq.main.tables.Article
import link.kotlin.server.jooq.main.tables.ArticleAuthor
import link.kotlin.server.jooq.main.tables.ArticleKotlinVersion
import link.kotlin.server.jooq.main.tables.ArticleLibrary
import link.kotlin.server.jooq.main.tables.ArticleTopic
import link.kotlin.server.jooq.main.tables.Book
import link.kotlin.server.jooq.main.tables.BookLibrary
import link.kotlin.server.jooq.main.tables.BookSpeaker
import link.kotlin.server.jooq.main.tables.Bookmark
import link.kotlin.server.jooq.main.tables.Comment
import link.kotlin.server.jooq.main.tables.Company
import link.kotlin.server.jooq.main.tables.Course
import link.kotlin.server.jooq.main.tables.CourseLibrary
import link.kotlin.server.jooq.main.tables.CourseSpeaker
import link.kotlin.server.jooq.main.tables.DmLikes
import link.kotlin.server.jooq.main.tables.EntityTag
import link.kotlin.server.jooq.main.tables.FlywaySchemaHistory
import link.kotlin.server.jooq.main.tables.KotlinVersion
import link.kotlin.server.jooq.main.tables.Kotliner
import link.kotlin.server.jooq.main.tables.KotlinerLikeEntityState
import link.kotlin.server.jooq.main.tables.KotlinerReadEntityState
import link.kotlin.server.jooq.main.tables.Kug
import link.kotlin.server.jooq.main.tables.KugEvent
import link.kotlin.server.jooq.main.tables.KugMember
import link.kotlin.server.jooq.main.tables.Library
import link.kotlin.server.jooq.main.tables.LibraryVersion
import link.kotlin.server.jooq.main.tables.Repository
import link.kotlin.server.jooq.main.tables.Topic
import link.kotlin.server.jooq.main.tables.Vacancy
import link.kotlin.server.jooq.main.tables.Video
import link.kotlin.server.jooq.main.tables.VideoLibrary
import link.kotlin.server.jooq.main.tables.VideoSpeaker



/**
 * The table <code>public.article</code>.
 */
val ARTICLE: Article = Article.ARTICLE

/**
 * The table <code>public.article_author</code>.
 */
val ARTICLE_AUTHOR: ArticleAuthor = ArticleAuthor.ARTICLE_AUTHOR

/**
 * The table <code>public.article_kotlin_version</code>.
 */
val ARTICLE_KOTLIN_VERSION: ArticleKotlinVersion = ArticleKotlinVersion.ARTICLE_KOTLIN_VERSION

/**
 * The table <code>public.article_library</code>.
 */
val ARTICLE_LIBRARY: ArticleLibrary = ArticleLibrary.ARTICLE_LIBRARY

/**
 * The table <code>public.article_topic</code>.
 */
val ARTICLE_TOPIC: ArticleTopic = ArticleTopic.ARTICLE_TOPIC

/**
 * The table <code>public.book</code>.
 */
val BOOK: Book = Book.BOOK

/**
 * The table <code>public.book_library</code>.
 */
val BOOK_LIBRARY: BookLibrary = BookLibrary.BOOK_LIBRARY

/**
 * The table <code>public.book_speaker</code>.
 */
val BOOK_SPEAKER: BookSpeaker = BookSpeaker.BOOK_SPEAKER

/**
 * The table <code>public.bookmark</code>.
 */
val BOOKMARK: Bookmark = Bookmark.BOOKMARK

/**
 * The table <code>public.comment</code>.
 */
val COMMENT: Comment = Comment.COMMENT

/**
 * The table <code>public.company</code>.
 */
val COMPANY: Company = Company.COMPANY

/**
 * The table <code>public.course</code>.
 */
val COURSE: Course = Course.COURSE

/**
 * The table <code>public.course_library</code>.
 */
val COURSE_LIBRARY: CourseLibrary = CourseLibrary.COURSE_LIBRARY

/**
 * The table <code>public.course_speaker</code>.
 */
val COURSE_SPEAKER: CourseSpeaker = CourseSpeaker.COURSE_SPEAKER

/**
 * The table <code>public.dm_likes</code>.
 */
val DM_LIKES: DmLikes = DmLikes.DM_LIKES

/**
 * The table <code>public.entity_tag</code>.
 */
val ENTITY_TAG: EntityTag = EntityTag.ENTITY_TAG

/**
 * The table <code>public.flyway_schema_history</code>.
 */
val FLYWAY_SCHEMA_HISTORY: FlywaySchemaHistory = FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY

/**
 * The table <code>public.kotlin_version</code>.
 */
val KOTLIN_VERSION: KotlinVersion = KotlinVersion.KOTLIN_VERSION

/**
 * The table <code>public.kotliner</code>.
 */
val KOTLINER: Kotliner = Kotliner.KOTLINER

/**
 * The table <code>public.kotliner_like_entity_state</code>.
 */
val KOTLINER_LIKE_ENTITY_STATE: KotlinerLikeEntityState = KotlinerLikeEntityState.KOTLINER_LIKE_ENTITY_STATE

/**
 * The table <code>public.kotliner_read_entity_state</code>.
 */
val KOTLINER_READ_ENTITY_STATE: KotlinerReadEntityState = KotlinerReadEntityState.KOTLINER_READ_ENTITY_STATE

/**
 * The table <code>public.kug</code>.
 */
val KUG: Kug = Kug.KUG

/**
 * The table <code>public.kug_event</code>.
 */
val KUG_EVENT: KugEvent = KugEvent.KUG_EVENT

/**
 * The table <code>public.kug_member</code>.
 */
val KUG_MEMBER: KugMember = KugMember.KUG_MEMBER

/**
 * The table <code>public.library</code>.
 */
val LIBRARY: Library = Library.LIBRARY

/**
 * The table <code>public.library_version</code>.
 */
val LIBRARY_VERSION: LibraryVersion = LibraryVersion.LIBRARY_VERSION

/**
 * The table <code>public.repository</code>.
 */
val REPOSITORY: Repository = Repository.REPOSITORY

/**
 * The table <code>public.topic</code>.
 */
val TOPIC: Topic = Topic.TOPIC

/**
 * The table <code>public.vacancy</code>.
 */
val VACANCY: Vacancy = Vacancy.VACANCY

/**
 * The table <code>public.video</code>.
 */
val VIDEO: Video = Video.VIDEO

/**
 * The table <code>public.video_library</code>.
 */
val VIDEO_LIBRARY: VideoLibrary = VideoLibrary.VIDEO_LIBRARY

/**
 * The table <code>public.video_speaker</code>.
 */
val VIDEO_SPEAKER: VideoSpeaker = VideoSpeaker.VIDEO_SPEAKER
