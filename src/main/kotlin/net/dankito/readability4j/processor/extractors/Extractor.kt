package net.dankito.readability4j.processor.extractors

import org.jsoup.nodes.Document

class Extractor(private val doc: Document) {
    fun date() = DateExtractor.extract(doc)
    fun authors() = AuthorsExtractor.extract(doc)
}