package com.elvina.todolist.ui.alltasks

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.elvina.todolist.data.PreferencesManager
import com.elvina.todolist.data.TaskDao
import dagger.assisted.Assisted
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class AllTasksViewModel @Inject constructor(
    private val taskDao: TaskDao,
    private val preferencesManager: PreferencesManager,
    private val state: SavedStateHandle
) : ViewModel() {

}