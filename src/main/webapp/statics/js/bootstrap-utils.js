/*bootstrap-utils.js*/
function addDismissButtonToAlert(alertControl) {
 	$(alertControl).html("<button type=\"button\" class=\"close\" aria-label=\"Close\" onclick=\"$(this).parent().hide()\"><span aria-hidden=\"true\">&times;</span></button>" + $(alertControl).html());
}
    
function hideAllAlerts() {
    $("div[id^='alert-']").each(function() {$(this).hide();});
}
  
function showAlert(t, html_msg) {
    $("#alert-" + t).html(html_msg);
    addDismissButtonToAlert("#alert-" + t);
    $("#alert-" + t).show();
}

function convertTimeOfDateToString(d) {
    var date = new Date();
    date.setTime(Date.parse(d));
    var day = date.getDate();
    var month = date.getMonth() + 1;
    var year = date.getFullYear();
    return year + "-" + month + "-" + day;
}

function convertStringToDate(s) {
	var sa = s.split("-");
	var date = new Date();
	date.setFullYear(parseInt(sa[0]));
	date.setMonth(parseInt(sa[1]));
	date.setDate(parseInt(sa[2]));
	return date;
}

function showPopover(control, placement, title, content) {
	hideAllPopovers();
	
//	if (isOnClick == undefined && isOnClick == null && isOnClick == true) {
//		window.stopDocumentClickPropagationForPopover = true;
//	}
	
	var jQueryControl = $(control);
	jQueryControl.data("container", "body");
	jQueryControl.data("placement", placement);
	jQueryControl.data("html", true);
	jQueryControl.data("title", title);
	//jQueryControl.data("content", content + "<br /><a href=\"#\" onclick=\"$('" + control + "').popover('hide');return false;\">好的</a>");
	jQueryControl.data("content", content);
	jQueryControl.addClass("popup-marker");
	jQueryControl.popover("show").off("click").on("click", function(e) {
        e.stopPropagation();
	});
	// handle clicking on the popover itself
    $('.popover').off('click').on('click', function(e) {
        e.stopPropagation(); // prevent event for bubbling up => will not get caught with document.onclick
    });
}

var hideAllPopovers = function() {
    $('.popup-marker').each(function() {
         $(this).popover('hide');
         $(this).removeClass("popup-marker")
     });  
 };
 
 $(document).on('click', function(e) {
//	 if (window.stopDocumentClickPropagationForPopover != undefined &&
//			 window.stopDocumentClickPropagationForPopover != null &&
//			 window.stopDocumentClickPropagationForPopover == true) {
//		 window.stopDocumentClickPropagationForPopover = false;
//		 return;
//	 }
	 
     hideAllPopovers();
 });
 
// 
// 
//
//jQuery(function() {
//    window.popoverIsVisible = false;
//
//    var hideAllPopovers = function() {
//       $('.popup-marker').each(function() {
//            $(this).popover('hide');
//        });  
//    };
//
//    $('.popup-marker').popover({
//        html: true,
//        trigger: 'manual'
//    }).on('click', function(e) {
//        // if any other popovers are visible, hide them
//        if(window.popoverIsVisibleisVisible) {
//            hideAllPopovers();
//        }
//
//        $(this).popover('show');
//
//        // handle clicking on the popover itself
//        $('.popover').off('click').on('click', function(e) {
//            e.stopPropagation(); // prevent event for bubbling up => will not get caught with document.onclick
//        });
//
//        isVisible = true;
//        e.stopPropagation();
//    });
//
//
//    $(document).on('click', function(e) {
//        hideAllPopovers();
//        window.popoverIsVisible = false;
//    });
//});


String.prototype.endWith=function (s) {
	  if(s==null || s=="" || this.length==0 || s.length>this.length)
	     return false;
	  if(this.substring(this.length-s.length)==s)
	     return true;
	  else
	     return false;
	  return true;
	 }
function strisNu(s) {                     //判断一个string是不是number
	var number = parseInt(s);
	if(number.toString() == "NaN"){
		return false;
	}
	else
		return true;
}



function dictCheck(txt) {
	var dict = [
	    "",
	    "<br>",
	    "<br/>",
	    "<p><br></p>"
	];
	var errCode = [0,0,0,0];
	dict.forEach(function(item,index){
		if (txt == item) {
			errCode[index] = 1;
		} 
	})
	errCode.forEach(function(item,index){
		if (item == 1) {
			return false;
		}
	})
	return true;
};
