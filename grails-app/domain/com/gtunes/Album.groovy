package com.gtunes

class Album {
    String title

    static hasMany = [songs:Song]

    static constraints = {
    }

    @Override
    String toString(){
        title
    }
}
