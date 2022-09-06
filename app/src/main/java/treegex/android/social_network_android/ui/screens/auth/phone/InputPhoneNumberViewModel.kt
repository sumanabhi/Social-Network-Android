package treegex.android.social_network_android.ui.screens.auth.phone

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.FlowPreview
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch
import treegex.android.social_network_android.data.datasource.remote.ApiService
import treegex.android.social_network_android.data.model.Response
import treegex.android.social_network_android.data.repository.ApiRepository
import treegex.android.social_network_android.di.RepositoryModule
import treegex.android.social_network_android.util.network.DataState
import javax.inject.Inject

@HiltViewModel
class InputPhoneNumberViewModel @Inject constructor(private val repo: ApiRepository) : ViewModel() {

    val responseGenerateUser: MutableState<DataState<Response>?> = mutableStateOf(null)

    @ExperimentalCoroutinesApi
    @FlowPreview
    fun generateUser(phone: String) {
        viewModelScope.launch {
            viewModelScope.launch {
                flowOf(phone).filter {
                    it.trim().isEmpty().not()
                }.distinctUntilChanged()
                    .flatMapConcat {
                        repo.generateUser(it)
                    }.collect {
                        if (it is DataState.Success)
                            it.data.code
                        responseGenerateUser.value = it
                    }
            }
        }
    }

}