package com.dean.academies.ui.academy.bookmark

import com.dean.academies.data.CourseEntity

interface BookmarkFragmentCallback {
    fun onShareClick(course: CourseEntity)
}