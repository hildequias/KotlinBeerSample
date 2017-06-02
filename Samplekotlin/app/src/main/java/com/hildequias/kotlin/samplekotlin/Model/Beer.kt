package com.hildequias.kotlin.samplekotlin.Model

/**
 * Created by junior on 6/2/17.
 */


class Beer: Object() {

    val ID = "id"
    val NAME = "name"
    val TAGLINE = "tagline"
    val FIRST_BREWED = "first_brewed"
    val DESC = "description"
    val IMAGE_URL = "image_url"
    val ABV = "abv"
    val IBU = "ibu"
    val TARGET_FG = "target_fg"
    val TARGET_OG = "target_og"
    val EBC = "ebc"
    val SRM = "srm"
    val PH = "ph"
    val ATTENUATION_LEVEL = "attenuation_level"

    var Id: Int = 0
    var Name: String = ""
    var Tagline: String? = ""
    var FirstBrewed: String? = ""
    var Desc: String? = ""
    var ImageUrl: String? = ""
    var Ibu: Int = 0
    var TargetFg: Int = 0
    var TargetOg: Int = 0
    var Ebc: Int = 0
    var Srm: Int = 0
    var AttenuationLevel: Int = 0
    var Ph: Float = 0.0f
    var Abv: Float = 0.0f

    fun Beer(id:Int, name:String, tagLine:String, firstBrewed:String, desc:String, imageUrl:String, ibu:Int, targetFg:Int, targetOg:Int,
             ebc:Int, srm:Int, attenuationLevel:Int, ph:Float, abv:Float) {

        Id = id
        Name = name
        Tagline = tagLine
        FirstBrewed = firstBrewed
        Desc = desc
        ImageUrl = imageUrl
        Ibu = ibu
        TargetFg = targetFg
        TargetOg = targetOg
        Ebc = ebc
        Srm = srm
        AttenuationLevel = attenuationLevel
        Ph = ph
        Abv = abv

    }


}



