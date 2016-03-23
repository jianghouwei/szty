function c(obj) {
    return jQuery(document.createElement(obj));
}
;
jQuery.fn.extend(
    {
        defaultSelect:function () {
            var thisSelectObj = jQuery(this);
            jQuery(thisSelectObj).css({
                display:'none'
            });
            var parent = thisSelectObj.parent();
            var defaultOption;
            var optionButton = true;
            var selectHTML = '<div class="type">' + '<div class="type_click">' + '<div class="type_left"></div>' + '<div class="type_b"><font></font></div>' + '<div class="type_arrow"></div>' + '</div>';
            if (optionButton) {
                selectHTML = selectHTML + '<div class="type_ul_box">' + '<div class="type_list_bg">' + '<div class="type_list_bg_l"></div>' + '<div class="type_list_bg_b"></div>' + '<div class="type_list_bg_r"></div>' + '</div>' + '<ul class="type_text"></ul>' + '</div>';
            }
            var objType = jQuery(c('div')).addClass('type_box').html(selectHTML);
            var defaultOptionIndex = 0;
            var thisOptionIndex;
            var textLength = 0;
            var mostText;
            jQuery.each(thisSelectObj.find('option'), function (i, o) {
                var option = jQuery(c('li')).html('<font>' + jQuery(o).html() + '</font>').appendTo(jQuery(objType).find('ul'));
                if (jQuery(o).html().length > textLength) {
                    mostText = i;
                    textLength = jQuery(o).html().length;
                }
                if (jQuery(o).attr('selected') == 'selected') {
                    defaultOptionIndex = i;
                    jQuery(option).css({
                        color:'#FFF'
                    });
                }
                jQuery(option).click(
                    function () {
                        if (i != defaultOptionIndex) {
                            jQuery(this).parent().find('li').css({
                                color:'#999'
                            });
                            jQuery(this).css({
                                color:'#FFF'
                            });
                            defaultOptionIndex = i;
                            var thisObj = jQuery(this).parent().parent().parent().parent().prev();
                            if (thisObj.attr('id') == '' || thisObj.attr('id') == 'undefined' || thisObj.attr('id') == null) {
                                thisObj.attr('id', 'select_' + thisSelect);
                            }
                            document.getElementById(thisObj.attr('id')).options[i].selected = 'selected';
                            jQuery(this).find('.type_b').find('font').html(jQuery(o).html());
                            jQuery(this).parent().parent().prev().find('.type_b').find('font').html(jQuery(o).html());
                            thisObj.change();
                            $(objType).find('.type_ul_box').css({zIndex:99999});
                        }
                        ;
                    }).hover(function () {
                        jQuery(objType).find('.type_list_bg').stop().animate({
                                top:i * 26 + 8
                            },
                            200, function () {
                                jQuery(option).parent().find('li').css({
                                    color:'#999'
                                });
                                jQuery(option).css({
                                    color:'#FFF'
                                });
                            });
                    },
                    function () {
                        jQuery(objType).find('.type_list_bg').stop().animate({
                                top:defaultOptionIndex * 26 + 8
                            },
                            200, function () {
                                jQuery(option).parent().find('li').css({
                                    color:'#999'
                                });
                                jQuery(option).parent().find('li').eq(defaultOptionIndex).css({
                                    color:'#FFF'
                                });
                            });
                    });
            });
            jQuery(objType).find('.type_list_bg').css({
                top:defaultOptionIndex * 26 + 8
            });
            if (thisSelectObj.find('option').eq(0).html() != null) {
                defaultOption = thisSelectObj.find('option').eq(defaultOptionIndex).html();
            }
            else {
                defaultOption = "暂无选项";
                optionButton = false;
            }
            jQuery(objType).find('.type_b').find('font').html(defaultOption);
            jQuery(objType).appendTo(parent);
            if (optionButton) {
                var thisHTML = jQuery(objType).find('.type_b').find('font').html();
                jQuery(objType).find('.type_b').find('font').html(jQuery(objType).find('li').eq(mostText).find('font').html());
                jQuery(objType).find('.type_b').width(jQuery(objType).find('.type_b').find('font').width() + 4);
                jQuery(objType).find('.type_ul_box').width(jQuery(objType).find('.type_click').width() - 6);
                jQuery(objType).find('.type_b').find('font').html(thisHTML);
                jQuery(objType).find('.type_click').click(
                    function () {
                        if (jQuery(this).next().height() == 0) {
                            openList(this);
                        }
                        else {
                            bindList();
                        }
                    }).hover(function () {
                        jQuery('*').unbind('click', bindList);
                    },
                    function () {
                        jQuery('*').click(bindList);
                    });
                jQuery(objType).find('.type_list_bg_b').width(jQuery(objType).find('.type_ul_box').width() - 26);
            }
            ;
            function bindList() {
                jQuery(objType).find('.type_ul_box').stop().animate({
                        height:0
                    },
                    200, function () {
                        jQuery('*').unbind('click', bindList);

                    });
                $(objType).find('.type_ul_box').css({zIndex:0});
                var arrowHeight = 360;

                function closeArrow() {
                    if (arrowHeight < 720) {
                        arrowHeight = arrowHeight + 20;
                        jQuery(objType).find('.type_arrow').css({
                            backgroundPosition:'0 -' + arrowHeight + 'px'
                        });
                    }
                    else {
                        window.clearInterval(xh);
                    }
                }

                ;
                var xh = window.setInterval(closeArrow, 15);


            }

            function openList(_this) {
                jQuery(_this).next().stop().animate({
                    height:jQuery(_this).next().find('ul').height() + 10
                }, 200);
                var arrowHeight = 0;

                function closeArrow() {
                    if (arrowHeight < 360) {
                        arrowHeight = arrowHeight + 20;
                        jQuery(objType).find('.type_arrow').css({
                            backgroundPosition:'0 -' + arrowHeight + 'px'
                        });
                    }
                    else {
                        window.clearInterval(xh);
                    }
                }

                ;
                var xh = window.setInterval(closeArrow, 15);
                $(objType).find('.type_ul_box').css({zIndex:99999999});
            }
        },
        defaultTrundle:function (o) {
            var _this = jQuery(this).css({
                overflow:'hidden'
            }).addClass('defaultTrundleBox');
            o.height = jQuery(_this).height();
            //alert(_this.find('.defaultTrundle').height())
            _this.html(jQuery(c('div')).addClass('defaultTrundleCs').html(_this.html())).css({
                overflow:'hidden', height:o.height, position:'relative'
            });
            if (o.height <= _this.find('.defaultTrundleCs').height()) {
                if (o.opacity == null) {
                    o.opacity[0] = 1;
                    o.opacity[1] = 1;
                }
                _this.html(jQuery(c('div')).addClass('defaultTrundle').html(_this.find('.defaultTrundleCs').html())).css({
                    overflow:'hidden', height:o.height, position:'relative'
                });
                var blockKingBg = jQuery(c('div')).addClass('blockKingBg').css({
                    width:10, height:o.height
                }).appendTo(_this);
                if (o.direction == '' || o.direction == 'right' || o.direction == null) {
                    _this.find('.defaultTrundle').css({
                        width:_this.width() - 16, float:'left', overflow:'hidden'
                    });
                    blockKingBg.css({
                        right:3, position:'absolute'
                    });
                }
                else {
                    _this.find('.defaultTrundle').css({
                        width:_this.width() - 16, float:'right', overflow:'hidden'
                    });
                    blockKingBg.css({
                        left:3, position:'absolute'
                    });
                }
                var Percentage = o.height / _this.find('.defaultTrundle').height() * 100 + '%';
                var blockKing = jQuery(c('div')).addClass('blockKing').css({
                    width:8, margin:'0 1px', background:'#000'
                }).appendTo(blockKingBg);
                blockKing.height(Percentage);
                if (blockKing.height() < 8) {
                    blockKing.height(8);
                }
                var top = 0;
                var bTop = 0;
                var blockKingBg_top = null;
                var blockKingBg_bottom = null;
                var s;
                var d = false;
                jQuery(blockKing).bind('mousedown', function (ev) {
                    d = true;
                    s = mouseMove(this, ev).y;
                });
                jQuery(blockKingBg).bind('mousedown', function (ev) {
                    if (blockKingBg_top == null) {
                        blockKingBg_top = mousePosition(this, ev).y - (s + parseInt(jQuery(blockKing).css('margin-top')));
                        blockKingBg_bottom = blockKingBg_top + jQuery(blockKingBg).height();
                    }
                });
                var opacityD = function () {
                    blockKingBg.stop().animate({
                        opacity:o.opacity[0]
                    }, 300);
                }
                var hdOp = true;
                var hdOpD = function () {
                    hdOp = false;
                }
                var hdOpS = function () {
                    hdOp = true;
                }
                jQuery('*').bind('mousemove',
                    function (ev) {
                        if (d) {
                            //dds = true;
                            _this.unbind('mouseout', opacityD);
                            _this.bind('mouseover', hdOpS).bind('mouseout', hdOpD);
                            jQuery('body').css({
                                WebkitUserSelect:'none', MozUserSelect:'none'
                            });
                            document.body.onselectstart = document.body.ondrag = function () {
                                return false;
                            }
                            var documentTop = mousePosition(this, ev).y;
                            //alert(documentTop);
                            if (documentTop - blockKingBg_top - s >= 0 && documentTop - blockKingBg_top - s <= jQuery(blockKingBg).height() - jQuery(blockKing).height()) {
                                //jQuery('#sb').html(documentTop+'----'+blockKingBg_top);
                                jQuery(blockKing).css({
                                    marginTop:documentTop - blockKingBg_top - s
                                });
                            }
                            else {
                                if (documentTop - blockKingBg_top - s < 0) {
                                    jQuery(blockKing).css({
                                        marginTop:0
                                    });
                                }
                                else if (documentTop - blockKingBg_top - s > jQuery(blockKingBg).height() - jQuery(blockKing).height()) {
                                    jQuery(blockKing).css({
                                        marginTop:jQuery(blockKingBg).height() - jQuery(blockKing).height()
                                    });
                                }
                            }
                            var defaultTrundleTop = ((parseFloat(jQuery(blockKing).css('margin-top')) / (jQuery(blockKingBg).height() - jQuery(blockKing).height()) * 100) / 100 * (jQuery(_this).find('.defaultTrundle').height() - o.height));
                            defaultTrundleTop = defaultTrundleTop - defaultTrundleTop - defaultTrundleTop;
                            jQuery(_this).find('.defaultTrundle').css({
                                marginTop:defaultTrundleTop
                            });
                        }
                    }).bind('mouseup', function () {
                        //if(!dds)blockKingBg.stop().animate({opacity:0},300);
                        d = false;
                        _this.bind('mouseout', opacityD);
                        if (!hdOp) {
                            opacityD();
                        }
                        jQuery('body').css({
                            WebkitUserSelect:'auto', MozUserSelect:'inherit'
                        });
                        document.body.onselectstart = document.body.ondrag = function () {
                            return true;
                        }
                    });
                blockKingBg.css({
                    opacity:o.opacity[0]
                });
                var thisSs = false;
                jQuery(_this).bind('mouseover',
                    function () {
                        blockKingBg.stop().animate({
                            opacity:o.opacity[1]
                        }, 300);
                    }).bind('mouseout', opacityD).hover(function () {
                        thisSs = true;
                        addDisabledMouseWheel();
                    },
                    function () {
                        thisSs = false;
                        removeDisabledMouseWheel();
                    });
                function addTrundle(type, size) {
                    if (type == 0) {
                        top = parseInt(_this.find('.defaultTrundle').css('margin-top')) + size;
                        var daTop = 0;
                        if (daTop < top) {
                            top = daTop;
                            if (thisSs) {
                                removeDisabledMouseWheel();
                            }
                        }
                        else if (thisSs) {
                            addDisabledMouseWheel();
                        }
                    }
                    else {
                        top = parseInt(_this.find('.defaultTrundle').css('margin-top')) - size;
                        var daTop = (_this.find('.defaultTrundle').height() - _this.height()) - (_this.find('.defaultTrundle').height() - _this.height()) - (_this.find('.defaultTrundle').height() - _this.height());
                        if (daTop >= top) {
                            top = daTop;
                            if (thisSs) {
                                removeDisabledMouseWheel();
                            }
                        }
                        else if (thisSs) {
                            addDisabledMouseWheel();
                        }
                    }
                    bTop = ((top - top - top) / (_this.find('.defaultTrundle').height() - o.height) * 100) / 100 * (o.height - blockKing.height());
                    _this.find('.defaultTrundle').css({
                        marginTop:top
                    });
                    blockKing.css({
                        marginTop:bTop
                    });
                }

                var scrollFunc = function (e) {
                    var direct = 0;
                    e = e || window.event;
                    if (e.wheelDelta) {
                        //IE/Opera/Chrome
                        if (e.wheelDelta > 0) {
                            addTrundle(0, 20);
                        }
                        else {
                            addTrundle(1, 20);
                        }
                    }
                    else if (e.detail) {
                        //Firefox
                        if (e.detail < 0) {
                            addTrundle(0, 20);
                        }
                        else {
                            addTrundle(1, 20);
                        }
                        ;
                    }
                }
                /*注册事件*/
                if (document.addEventListener) {
                    document.getElementById(jQuery(_this).attr('id')).addEventListener('DOMMouseScroll', scrollFunc,
                        false);
                }
                //W3C
                document.getElementById(jQuery(_this).attr('id')).onmousewheel = scrollFunc;
                //IE/Opera/Chrome
                function mousePosition(t, ev) {
                    if (ev.pageX || ev.pageY) {
                        return {
                            x:ev.pageX, y:ev.pageY
                        };
                    }
                    return {
                        x:ev.clientX + t.scrollLeft - t.clientLeft, y:ev.clientY + t.scrollTop - t.clientTop
                    };
                }

                function getAbsPoint(e) {
                    var x = e.offsetLeft;
                    var y = e.offsetTop;
                    while (e = e.offsetParent) {
                        x += e.offsetLeft;
                        y += e.offsetTop;
                    }
                    return {
                        'x':x, 'y':y
                    };
                }

                function mouseMove(t, ev) {
                    ev = ev || window.event;
                    var mousePos = mousePosition(t, ev);
                    //document.getElementById('xxx').value = mousePos.x-getAbsPoint(t).x;
                    //document.getElementById('yyy').value = ;
                    return {
                        'x':mousePos.y - getAbsPoint(t).x, 'y':mousePos.y - getAbsPoint(t).y
                    };
                }
            }
            else {
                _this.html(_this.find('.defaultTrundleCs').html());
            }
        },
        registersTrundle:function (o) {
            var _this = jQuery(this);
            //var bodyHeight = _this.find('.defaultTrundle').height();
            //if(_this.find('.defaultTrundle').height())
            if (_this.find('.defaultTrundle').html() == null) {
                if (o == null) {
                    var o = {};
                }
                o.height = _this.height();
                _this.html(jQuery(c('div')).addClass('defaultTrundleCs').html(_this.html())).css({
                    overflow:'hidden', height:o.height, position:'relative'
                });
                if (o.height <= _this.find('.defaultTrundleCs').height()) {
                    _this.html(_this.find('.defaultTrundleCs').html());
                    _this.defaultTrundle({
                        direction:'right'
                    });
                }
            }
            else {
                var boxHeight = _this.height();
                var nrHeight = _this.find('.defaultTrundle').height();
                var nrTop = parseInt(_this.find('.defaultTrundle').css('margin-top'));
                var tdHeight = _this.find('.blockKingBg').height();
                var blockHeight = (boxHeight / nrHeight) * tdHeight;
                if (blockHeight < 8) {
                    blockHeight = 8;
                }
                _this.find('.blockKing').stop().animate(
                    {
                        marginTop:((nrTop - nrTop - nrTop) / (_this.find('.defaultTrundle').height() - boxHeight) * 100) / 100 * (boxHeight - _this.find('.blockKing').height()),
                        height:blockHeight
                    }, 300);
            }
        }
    });
function addDisabledMouseWheel() {
    if (document.addEventListener) {
        document.addEventListener('DOMMouseScroll', scrollFunc, false);
    }
    //W3C
    window.onmousewheel = document.onmousewheel = scrollFunc;
    //IE/Opera/Chrome
}
function removeDisabledMouseWheel() {
    if (document.addEventListener) {
        document.removeEventListener('DOMMouseScroll', scrollFunc, false);
    }
    //W3C
    window.onmousewheel = document.onmousewheel = '';
    //IE/Opera/Chrome
}
function scrollFunc(evt) {
    evt = evt || window.event;
    if (evt.preventDefault) {
        // Firefox
        evt.preventDefault();
        evt.stopPropagation();
    }
    else {
        // IE
        evt.cancelBubble = true;
        evt.returnValue = false;
    }
    return false;
}
//window.onload=disabledMouseWheel;
//function backgroundAnimate(obj,){};
jQuery(function () {
    jQuery('#s1').defaultSelect();
});