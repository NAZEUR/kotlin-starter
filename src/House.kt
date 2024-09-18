class House {
    // Properti outer class
    val buildingArea = 100
    inner class Room {
        val totalRooms = 4
        fun measureRoomArea() {
            // Inner class dapat mengakses properti pada outer class
            print(buildingArea/totalRooms)
        }
    }
}

fun main() {
    val house = House()
    val room = house.Room()
    room.measureRoomArea()
}

/*
class House {
    // Properti atau anggota outer class
    val buildingArea = 100
    val totalRooms = 4

    inner class Room {
        // Properti atau anggota inner class
        val totalRooms = 4
        fun measureRoomArea() {
            // Inner class dapat mengakses properti atau anggota outer class
            print(buildingArea/this@House.totalRooms)
        }
    }
}

 */