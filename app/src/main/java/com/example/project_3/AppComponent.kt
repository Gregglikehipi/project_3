package com.example.project_3

import dagger.Component
import dagger.Module
import dagger.Provides

@Component(modules = [AppModule::class])
interface AppComponent {
    fun inject(mainActivity: MainActivity)

}

@Module
class AppModule {

    @Provides
    fun provideBlockPotionList(): List<BlockInfo> {
        //val list = BlockSupply.getPotions()
        //Log.w("Ho", list.size.toString())
        return BlockSupply.getLesson()
            // Add more BlockInfo instances with different text
    }

}