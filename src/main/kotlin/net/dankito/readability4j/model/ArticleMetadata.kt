package net.dankito.readability4j.model


open class ArticleMetadata(var title: String? = null, var byline: String? = null, var excerpt: String? = null, var dir: String? = null, var suggestedDate: String? = null, var suggestedAuthors: List<String>? = null)