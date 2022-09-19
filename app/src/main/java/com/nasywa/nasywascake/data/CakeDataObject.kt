package com.nasywa.nasywascake.data

import com.nasywa.nasywascake.R

object CakeDataObject {

    private val cakeName = arrayOf(
        "Chocolate Amberr",
        "Chocolate Madness",
        "CupCake",
        "Galaxy",
        "Glamore Choco",
        "Lotus Say Chesee",
        "Mermaid",
        "Ovomaltine Choco",
        "Pandan Cream",
        "Popcorn Caramello",
    )

    private val cakeLocation = arrayOf(
        "Jakarta Selatan",
        "Jakarta Selatan",
        "Jakarta Selatan",
        "Jakarta Selatan",
        "Jakarta Selatan",
        "Jakarta Selatan",
        "Jakarta Selatan",
        "Jakarta Selatan",
        "Jakarta Selatan",
        "Jakarta Selatan",
    )

    private val cakePrice = arrayOf(
        "Rp.468,000",
        "Rp.468.000",
        "Rp.300.000",
        "Rp.400,000",
        "Rp.385,000",
        "Rp.470,000",
        "Rp.400,000",
        "Rp.448,000",
        "Rp.450,000",
        "Rp.238,000",
    )

    private val cakeDetails = arrayOf(
        "Chocolate & Peanut Butter got all dressed up for a special occasion,Our rich cake gets covered in dark chocolate ganache and is decorated with peanut studded chocolate shards, handcrafted macarons, meringues and golden chocolate biscuit buttons. The perfect cake to gift or to celebrate with! ",
        "Same look with a more chocolate taste.We’ve upgraded our signature Chocolate Madness and changed the inside to that of our Chocolate Sunday. A rich chocolate cake with luscious Belgian chocolate ganache paired with a multitude of chocolate Candyland on top to make this the ultimate chocolate lover’s cake.",
        "Welcoming spring with our latest edition floral cupcakes. Crafted with love, care and sweet thoughts have been put into the creation of our beautiful and flavorful cupcakes. A delightful treat to accompany you in all of your days and special moments.Featuring new cupcake flavors: Sweet Ube and Popeye’s Spinach. ",
        "Step into another world with our multi colored galaxy cake.It's the perfect cake for stargazers and dreamers alike. If you want to be the talk of the party then enchant your friends with this glitter sparkling galaxy cake topped with our signature galaxy swirl macarons.",
        "Glamorous chocolate Paired with the same 'Chocolate Cake' recipe inside, but so much more! We provide a wide variety of famous chocolate brands for this special cake",
        "For the love of cheese cake! Ever wonder how cheese cake goes with the unique and legendary Lotus Biscoff? You will adore this fantastic combo. The thick and creamy cheese cake paired with a unique caramelized taste of Biscoff will surely be 2021’s Dynamic Duo.",
        "Add a touch of fantasy and take a dive under the sea with our Magical Mermaid cake. Made with our special edible pearls, chocolate mermaid tail and shiny seas stars. This cake will whisk you away from reality and remind you of why you loved cartoons as a child.Paired with our signature Chocolate Sunday cake inside",
        "Our customer’s love Ovomaltine so much we just had to put our signature Ovomaltine flavor with the creaminess of our cheesecake all on top of a buttery digestive biscuit base. A match made in heaven!",
        "It’s all about Pandan.Indulge in the sweet taste of Pandan cushioned in between multiple layers of Pandan sponge cake and Pandan jelly. All fused together with a combination of coconut milk, crunchy coconut flakes and white chocolate crisps. Finally adorned with swirls of buttercream and elegant macarons to complete the luscious look.Truly a Pandan Sensation!",
        "The iconic movie treat is re-imagined.Featuring a caramel popcorn overload arrangement from two waffle cones that are brushed with edible gold lustre.Inside is a silky caramel buttercream with almond crunch nestling between 3 layers of fluffy vanilla cake.An eye-catching crowd pleaser!",
    )

    private val cakesImage = intArrayOf(
        R.drawable.chocolateamberr,
        R.drawable.chocolatemadness,
        R.drawable.cupcakesset,
        R.drawable.galaxycake,
        R.drawable.glamorechoco,
        R.drawable.lotussaychesee,
        R.drawable.mermaid,
        R.drawable.ovomaltinechoco,
        R.drawable.pandancream,
        R.drawable.popcorncaramello,
    )

    val listData: ArrayList<CakesData>
    get() {
        val list = arrayListOf<CakesData>()
        for (position in cakeName.indices) {
            val cakes = CakesData()
            cakes.cakeName = cakeName[position]
            cakes.location = cakeLocation[position]
            cakes.price = cakePrice[position]
            cakes.detail = cakeDetails[position]
            cakes.photo = cakesImage[position]
            list.add(cakes)
        }
        return list
    }
}