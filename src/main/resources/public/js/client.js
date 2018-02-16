var x=0;
var prevX=0;

var nameArray= [];
var commentArray= [];

$(document).ready(function() {
    $("#prevBtn").on("click", function () {
        getPrev();
    });
    $("#nextBtn").on("click", function () {
        getNext();
    });
    init();
});

function init (){
    $.ajax({
        type: "GET",
        url: "/peopleList",
        success: function (data) {
            console.log(data);
        loadArray(data.people);
        }
        });
}

function loadArray (dataArray) {
    for (var i=0; i < dataArray.length; i++){
            nameArray[i] = dataArray[i].name;
            commentArray[i]=dataArray[i].comment;

    }
    //x=0;
    updateNameComment();
}

function updateNameComment() {
    $("#tname").text(nameArray[x]);
    $("#tcomment").text(commentArray[x]);
}

function getPrev () {
    if (x== 0){
        x=9;
   } else {
    x--;
    }
    updateNameComment();

}

function getNext () {
    if (x== 9){
        x=0;
    } else {
        x++;
    }
    updateNameComment();

}

