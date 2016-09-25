
function Activity(xPos,yPos,nombre,id) {
    this.nombre = nombre;
    this.id = -1;
    this.shape = new Kinetic.Group({
        x: xPos,
        y: yPos,
        draggable: true,
        id: this.id
    });
    this.text = new Kinetic.Text({
        text: nombre,
        fontSize: 10,
        fontFamily: "Calibri",
        textFill: "black",
        align: "center",
        verticalAlign: "middle"
    });
    var size = this.text.getTextSize();
    var width = size.width + (size.width >> 2);
    var height = size.height + (size.height << 1);
    this.width = width;
    this.height = height;
    this.box = new Kinetic.Rect({
        x: - (width >> 1),
        y: - (height >> 1),
        width: width,
        height: height,
        name: nombre + 'box',
        fill: "#88FF88",
        stroke: "black",
        alpha: 0.8,
        strokeWidth: 4
    });
    this.shape.add(this.box);
    this.shape.add(this.text);
    this.shape.box = this.box;
    this.shape.act = this;
    this.getFacingType = ActivityGetFacing;
    this.getFacing = ActivityGetFaceMidPoint;
    this.getX = ActivityGetShapeX;
    this.getY = ActivityGetShapeY;
}


function ActivityGetShapeX() {
    return this.shape.attrs.x;
}

function ActivityGetShapeY() {
    return this.shape.attrs.y;
}

function ActivityGetFacing(act2) {
    var yd = (act2.getY()-this.getY())/this.height;
    var xd = (act2.getX()-this.getX())/this.width;
    if (Math.abs(xd) > Math.abs(yd))
        if (xd > 0)
            return 3;
        else
            return 1;
    else 
        if (yd > 0)
            return 4;
        else
            return 2;
}

function ActivityGetFaceMidPoint(act2) {
    var w = this.width >> 1;
    var h = this.height >> 1;
    var i = this.getFacingType(act2);
    switch (i) {
        case 1:
            return new Point(this.getX() - w, this.getY());
            break;
        case 2:
            return new Point(this.getX(), this.getY() - h);
            break;
        case 3:
            return new Point(this.getX() + w, this.getY());
            break;
        case 4:
            return new Point(this.getX(), this.getY() + h);
            break;
        default:
            alert('Error en ActivityGetFaceMidPoint, cara desconocida');
            return null;
    }
}

