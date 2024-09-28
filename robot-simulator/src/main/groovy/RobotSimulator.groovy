enum Direction {
    north(0 as byte,  1 as byte), east( 1 as byte, 0 as byte),
    south(0 as byte, -1 as byte), west(-1 as byte, 0 as byte)

    byte dx, dy

    private Direction(byte dx, byte dy) {
        this.dx = dx
        this.dy = dy
    }
}

enum Rotation {
    L(-1 as byte), R(1 as byte)

    byte rotation

    private Rotation(byte rotation) { this.rotation = rotation }
}

class RobotSimulator {
    int pos_x, pos_y, dir

    RobotSimulator(int pos_x, int pos_y, String direction) {
        this.pos_x = pos_x
        this.pos_y = pos_y
        this.dir = Direction.values().toList().indexOf((Direction)direction)
    }

    def move(String commands) {
        commands.each{ (it == "A" ? advance() : rotate((Rotation)it)) }
    }

    def rotate(Rotation rotation) {
        dir = Math.floorMod((dir + rotation.rotation), 4)
    }

    def advance() {
        pos_x += Direction.values()[dir].dx
        pos_y += Direction.values()[dir].dy
    }
}
