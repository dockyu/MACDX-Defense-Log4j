function moveButton(e) {
    var cursorX = e.clientX;
    var cursorY = e.clientY;

    var buttonX = button.offsetLeft+50;
    var buttonY = button.offsetTop+15;

    var dx = buttonX - cursorX;
    var dy = buttonY - cursorY;

    var d = Math.sqrt(dx * dx + dy * dy);
    // var d = dx;

    if (d < distance && dx < distance_x) {
        var xMove = speed * (dx / d);
        // var yMove = speed * (dy / d);

        if (buttonX + xMove > maxWidth) {
            button.style.left = maxWidth + "px";
        } else if (buttonX + xMove < 0) {
            button.style.left = "0px";
        } else {
            button.style.left = buttonX + xMove + "px";
        }
        // if (buttonY + yMove > maxHeight) {
        //     button.style.top = maxHeight + "px";
        // } else if (buttonY + yMove < 0) {
        //     button.style.top = "0px";
        // } else {
        //     button.style.top = buttonY + yMove + "px";
        // }
    }
}