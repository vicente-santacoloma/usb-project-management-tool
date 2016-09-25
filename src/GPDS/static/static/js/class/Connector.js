
function Connector(act1,act2) {
    this.start = act1;
    this.end = act2;
    this.shape = new Kinetic.Group();
    this.line = new Kinetic.Line({
        strokeWidth: 2,
        stroke: "black"
    });
    this.punta = new Kinetic.Polygon({
          fill: "black",
          stroke: "black",
          strokeWidth: 1
    });
    this.shape.add(this.line);
    this.shape.add(this.punta);
}




