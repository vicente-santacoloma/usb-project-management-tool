function Point(x,y) {
    this.x = x;
    this.y = y;
    this.interpLineal = PointInterpLineal;
    this.collide = PointCollide;
}

function __InterpolacionLineal(p1,p2,t) {
    return p1 + (p2-p1)*t
}

function PointInterpLineal(p2,t) {
    return new Point(__InterpolacionLineal(this.x,p2.x,t),__InterpolacionLineal(this.y,p2.y,t));
}

function rad2deg(r) {
    return (r*180)/Math.PI
}

function deg2rad(d) {
    return (d*Math.PI)/180
}

function derivadaLineal(p1,p2) {
    var xd = (p2.x-p1.x);
    if (xd != 0)
        return (p2.y-p1.y)/xd;
    return 0x7FFFFFFF;
}

function AngleBetweenPoints(p1,p2) {
    return Math.atan2(p2.y-p1.y,p2.x-p1.x);
}

function ProjectPoint(p, angle, dist) {
    return new Point(p.x + Math.cos(angle)*dist,p.y + Math.sin(angle)*dist);
}

function PointCollide(p2) {
    return new Point(this.x,p2.y);
}

