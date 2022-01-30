package com.example.tugasapipokemon.model

import com.google.gson.annotations.SerializedName

data class ResponsePokemon(

	@field:SerializedName("data")
	val data: List<DataItem?>? = null,

	@field:SerializedName("count")
	val count: Int? = null,

	@field:SerializedName("pageSize")
	val pageSize: Int? = null,

	@field:SerializedName("page")
	val page: Int? = null,

	@field:SerializedName("totalCount")
	val totalCount: Int? = null
)

data class Tcgplayer(

	@field:SerializedName("prices")
	val prices: Prices? = null,

	@field:SerializedName("url")
	val url: String? = null,

	@field:SerializedName("updatedAt")
	val updatedAt: String? = null
)

data class AttacksItem(

	@field:SerializedName("damage")
	val damage: String? = null,

	@field:SerializedName("cost")
	val cost: List<String?>? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("text")
	val text: String? = null,

	@field:SerializedName("convertedEnergyCost")
	val convertedEnergyCost: Int? = null
)

data class WeaknessesItem(

	@field:SerializedName("type")
	val type: String? = null,

	@field:SerializedName("value")
	val value: String? = null
)

data class ReverseHolofoil(

	@field:SerializedName("market")
	val market: Double? = null,

	@field:SerializedName("high")
	val high: Double? = null,

	@field:SerializedName("low")
	val low: Double? = null,

	@field:SerializedName("mid")
	val mid: Double? = null,

	@field:SerializedName("directLow")
	val directLow: Double? = null
)

data class Set(

	@field:SerializedName("total")
	val total: Int? = null,

	@field:SerializedName("images")
	val images: Images? = null,

	@field:SerializedName("printedTotal")
	val printedTotal: Int? = null,

	@field:SerializedName("ptcgoCode")
	val ptcgoCode: String? = null,

	@field:SerializedName("releaseDate")
	val releaseDate: String? = null,

	@field:SerializedName("series")
	val series: String? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("legalities")
	val legalities: Legalities? = null,

	@field:SerializedName("id")
	val id: String? = null,

	@field:SerializedName("updatedAt")
	val updatedAt: String? = null
)

data class Prices(

	@field:SerializedName("holofoil")
	val holofoil: Holofoil? = null,

	@field:SerializedName("avg30")
	val avg30: Double? = null,

	@field:SerializedName("avg1")
	val avg1: Double? = null,

	@field:SerializedName("averageSellPrice")
	val averageSellPrice: Double? = null,

	@field:SerializedName("reverseHoloTrend")
	val reverseHoloTrend: Double? = null,

	@field:SerializedName("lowPrice")
	val lowPrice: Double? = null,

	@field:SerializedName("avg7")
	val avg7: Double? = null,

	@field:SerializedName("lowPriceExPlus")
	val lowPriceExPlus: Double? = null,

	@field:SerializedName("trendPrice")
	val trendPrice: Double? = null,

	@field:SerializedName("reverseHoloSell")
	val reverseHoloSell: Double? = null,

	@field:SerializedName("reverseHoloLow")
	val reverseHoloLow: Double? = null,

	@field:SerializedName("reverseHoloAvg7")
	val reverseHoloAvg7: Double? = null,

	@field:SerializedName("reverseHoloAvg30")
	val reverseHoloAvg30: Double? = null,

	@field:SerializedName("reverseHoloAvg1")
	val reverseHoloAvg1: Double? = null,

	@field:SerializedName("reverseHolofoil")
	val reverseHolofoil: ReverseHolofoil? = null,

	@field:SerializedName("normal")
	val normal: Normal? = null
)

data class Legalities(

	@field:SerializedName("unlimited")
	val unlimited: String? = null,

	@field:SerializedName("standard")
	val standard: String? = null,

	@field:SerializedName("expanded")
	val expanded: String? = null
)

data class ResistancesItem(

	@field:SerializedName("type")
	val type: String? = null,

	@field:SerializedName("value")
	val value: String? = null
)

data class Normal(

	@field:SerializedName("market")
	val market: Double? = null,

	@field:SerializedName("high")
	val high: Double? = null,

	@field:SerializedName("directLow")
	val directLow: Double? = null,

	@field:SerializedName("low")
	val low: Double? = null,

	@field:SerializedName("mid")
	val mid: Double? = null
)

data class Images(

	@field:SerializedName("symbol")
	val symbol: String? = null,

	@field:SerializedName("logo")
	val logo: String? = null,

	@field:SerializedName("small")
	val small: String? = null,

	@field:SerializedName("large")
	val large: String? = null
)

data class AbilitiesItem(

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("text")
	val text: String? = null,

	@field:SerializedName("type")
	val type: String? = null
)

data class Cardmarket(

	@field:SerializedName("prices")
	val prices: Prices? = null,

	@field:SerializedName("url")
	val url: String? = null,

	@field:SerializedName("updatedAt")
	val updatedAt: String? = null
)

data class Holofoil(

	@field:SerializedName("market")
	val market: Double? = null,

	@field:SerializedName("high")
	val high: Double? = null,

	@field:SerializedName("low")
	val low: Double? = null,

	@field:SerializedName("mid")
	val mid: Double? = null,

	@field:SerializedName("directLow")
	val directLow: Double? = null
)

data class DataItem(

	@field:SerializedName("supertype")
	val supertype: String? = null,

	@field:SerializedName("types")
	val types: List<String?>? = null,

	@field:SerializedName("images")
	val images: Images? = null,

	@field:SerializedName("retreatCost")
	val retreatCost: List<String?>? = null,

	@field:SerializedName("set")
	val set: Set? = null,

	@field:SerializedName("level")
	val level: String? = null,

	@field:SerializedName("artist")
	val artist: String? = null,

	@field:SerializedName("hp")
	val hp: String? = null,

	@field:SerializedName("convertedRetreatCost")
	val convertedRetreatCost: Int? = null,

	@field:SerializedName("legalities")
	val legalities: Legalities? = null,

	@field:SerializedName("rules")
	val rules: List<String?>? = null,

	@field:SerializedName("evolvesFrom")
	val evolvesFrom: String? = null,

	@field:SerializedName("tcgplayer")
	val tcgplayer: Tcgplayer? = null,

	@field:SerializedName("subtypes")
	val subtypes: List<String?>? = null,

	@field:SerializedName("abilities")
	val abilities: List<AbilitiesItem?>? = null,

	@field:SerializedName("number")
	val number: String? = null,

	@field:SerializedName("attacks")
	val attacks: List<AttacksItem?>? = null,

	@field:SerializedName("nationalPokedexNumbers")
	val nationalPokedexNumbers: List<Int?>? = null,

	@field:SerializedName("weaknesses")
	val weaknesses: List<WeaknessesItem?>? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("id")
	val id: String? = null,

	@field:SerializedName("rarity")
	val rarity: String? = null,

	@field:SerializedName("regulationMark")
	val regulationMark: String? = null,

	@field:SerializedName("cardmarket")
	val cardmarket: Cardmarket? = null,

	@field:SerializedName("flavorText")
	val flavorText: String? = null,

	@field:SerializedName("resistances")
	val resistances: List<ResistancesItem?>? = null,

	@field:SerializedName("evolvesTo")
	val evolvesTo: List<String?>? = null
)
