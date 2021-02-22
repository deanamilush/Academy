package com.dean.academies.ui.academy.bookmark

import androidx.lifecycle.ViewModel
import com.dean.academies.data.CourseEntity
import com.dean.academies.utils.DataDummy

class BookmarkViewModel : ViewModel() {

    fun getBookmarks(): List<CourseEntity> = DataDummy.generateDummyCourses()
}