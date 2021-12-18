package br.com.instagram.common.base

import android.content.Context
import br.com.instagram.add.data.AddFakeRemoteDataSource
import br.com.instagram.add.data.AddLocalDataSource
import br.com.instagram.add.data.AddRepository
import br.com.instagram.home.data.FeedMemoryCache
import br.com.instagram.home.data.HomeDataSourceFactory
import br.com.instagram.home.data.HomeRepository
import br.com.instagram.login.data.FakeDataSource
import br.com.instagram.login.data.LoginRepository
import br.com.instagram.post.data.PostLocalDataSource
import br.com.instagram.post.data.PostRepository
import br.com.instagram.profile.data.PostListMemoryCache
import br.com.instagram.profile.data.ProfileDataSourceFactory
import br.com.instagram.profile.data.ProfileMemoryCache
import br.com.instagram.profile.data.ProfileRepository
import br.com.instagram.register.data.FireRegisterDataSource
import br.com.instagram.register.data.RegisterRepository
import br.com.instagram.search.data.SearchFakeRemoteDataSource
import br.com.instagram.search.data.SearchRepository
import br.com.instagram.splash.data.FakeLocalDataSource
import br.com.instagram.splash.data.SplashRepository

object DependencyInjector {

    fun splashRepository(): SplashRepository {
        return SplashRepository(FakeLocalDataSource())
    }

    fun loginRepository(): LoginRepository {
        return LoginRepository(FakeDataSource())
    }

    fun registerEmailRepository(): RegisterRepository {
        return RegisterRepository(FireRegisterDataSource())
    }

    fun searchRepository(): SearchRepository {
        return SearchRepository(SearchFakeRemoteDataSource())
    }

    fun profileRepository(): ProfileRepository {
        return ProfileRepository(ProfileDataSourceFactory(ProfileMemoryCache, PostListMemoryCache))
    }

    fun homeRepository(): HomeRepository {
        return HomeRepository(HomeDataSourceFactory(FeedMemoryCache))
    }

    fun addRepository(): AddRepository {
        return AddRepository(AddFakeRemoteDataSource(), AddLocalDataSource())
    }

    fun postRepository(context: Context): PostRepository {
        return PostRepository(PostLocalDataSource(context))
    }

}