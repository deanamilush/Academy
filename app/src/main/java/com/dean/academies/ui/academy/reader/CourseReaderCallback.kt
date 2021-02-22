package com.dean.academies.ui.academy.reader

interface CourseReaderCallback {
    fun moveTo(position: Int, moduleId: String)
}