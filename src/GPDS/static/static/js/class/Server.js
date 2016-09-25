
function ServerActivity(id,name) {
    this.id = id;
    this.name = name;
    this.level = null;
    this.actClient = null;
    this.setAtop = ServerAct_setAtop;
}

function ServerAct_setAtop() {
    this.level = 1;
}

function ServerConnection(start,end) {
    this.start = start;
    this.end = end;
    this.level = this.start.level;
    var tmp = this.end.level;
    if (tmp == null) {
        this.end.level = this.level + 1;
    }
    else {
        if (tmp < (this.level + 1)) this.end.level = this.level + 1;
    }
}