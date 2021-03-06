package med.umerfarooq.com.videoeditor.FFmpeg

import android.content.Context

import com.github.hiteshsondhi88.libffmpeg.FFmpeg

import javax.inject.Singleton

import dagger.Module
import dagger.Provides
import med.umerfarooq.com.videoeditor.VideoFeatures.VideoThemes

@Module(injects = [VideoThemes::class])
class DaggerDependencyModuleThmes(private val context: Context) {

    @Provides
    @Singleton
    internal fun provideFFmpeg(): FFmpeg {
        return FFmpeg.getInstance(context.applicationContext)
    }

}
