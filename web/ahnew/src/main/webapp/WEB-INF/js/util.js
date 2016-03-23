/*
 * MAP对象，实现MAP功能
 *
 * 接口：
 * size()     获取MAP元素个数
 * isEmpty()    判断MAP是否为空
 * clear()     删除MAP所有元素
 * put(key, value)   向MAP中增加元素（key, value) 
 * remove(key)    删除指定KEY的元素，成功返回True，失败返回False
 * get(key)    获取指定KEY的元素值VALUE，失败返回NULL
 * element(index)   获取指定索引的元素（使用element.key，element.value获取KEY和VALUE），失败返回NULL
 * containsKey(key)  判断MAP中是否含有指定KEY的元素
 * containsValue(value) 判断MAP中是否含有指定VALUE的元素
 * values()    获取MAP中所有VALUE的数组（ARRAY）
 * keys()     获取MAP中所有KEY的数组（ARRAY）
 *
 * 例子：
 * var map = new Map();
 *
 * map.put("key", "value");
 * var val = map.get("key")
 * ……
 *
 */
function Map() {
    this.elements = new Array();

    //获取MAP元素个数
    this.size = function() {
        return this.elements.length;
    };

    //判断MAP是否为空
    this.isEmpty = function() {
        return (this.elements.length < 1);
    };

    //删除MAP所有元素
    this.clear = function() {
        this.elements = new Array();
    };

    //向MAP中增加元素（key, value) 
    this.put = function(_key, _value) {
        this.elements.push( {
            key : _key,
            value : _value
        });
    };

    //删除指定KEY的元素，成功返回True，失败返回False
    this.remove = function(_key) {
        var bln = false;
        try {
            for (var i = 0; i < this.elements.length; i++) {
                if (this.elements[i].key == _key) {
                    this.elements.splice(i, 1);
                    return true;
                }
            }
        } catch (e) {
            bln = false;
        }
        return bln;
    };

    //获取指定KEY的元素值VALUE，失败返回NULL
    this.get = function(_key) {
        try {
            for (var i = 0; i < this.elements.length; i++) {
                if (this.elements[i].key == _key) {
                    return this.elements[i].value;
                }
            }
        } catch (e) {
            return null;
        }
    };

    //获取指定索引的元素（使用element.key，element.value获取KEY和VALUE），失败返回NULL
    this.element = function(_index) {
        if (_index < 0 || _index >= this.elements.length) {
            return null;
        }
        return this.elements[_index];
    };

    //判断MAP中是否含有指定KEY的元素
    this.containsKey = function(_key) {
        var bln = false;
        try {
            for (var i = 0; i < this.elements.length; i++) {
                if (this.elements[i].key == _key) {
                    bln = true;
                }
            }
        } catch (e) {
            bln = false;
        }
        return bln;
    };

    //判断MAP中是否含有指定VALUE的元素
    this.containsValue = function(_value) {
        var bln = false;
        try {
            for (var i = 0; i < this.elements.length; i++) {
                if (this.elements[i].value == _value) {
                    bln = true;
                }
            }
        } catch (e) {
            bln = false;
        }
        return bln;
    };

    //获取MAP中所有VALUE的数组（ARRAY）
    this.values = function() {
        var arr = new Array();
        for (var i = 0; i < this.elements.length; i++) {
            arr.push(this.elements[i].value);
        }
        return arr;
    };

    //获取MAP中所有KEY的数组（ARRAY）
    this.keys = function() {
        var arr = new Array();
        for (var i = 0; i < this.elements.length; i++) {
            arr.push(this.elements[i].key);
        }
        return arr;
    };
}


/**
 * js实现list
 * 
 */
function List() {
    this.value = [];

    /* 添加 */
    this.add = function(obj) {
        return this.value.push(obj);
    };

    /* 大小 */
    this.size = function() {
        return this.value.length;
    };

    /* 返回指定索引的值 */
    this.get = function(index) {
        return this.value[index];
    };

    /* 删除指定索引的值 */
    this.remove = function(index) {
        this.value.splice(index,1);
        return this.value;
    };

    /* 删除全部值 */
    this.removeAll = function() {
        return this.value = [];
    };

    /* 是否包含某个对象 */
    this.constains = function(obj) {
        for ( var i in this.value) {
            if (obj == this.value[i]) {
                return true;
            } else {
                continue;
            }
        }
        return false;
    };
    
    /* 是否包含某个对象 */
    this.getAll = function() {
        var allInfos = '';
        for ( var i in this.value) {
            if(i != (value.length-1)){
                allInfos += this.value[i]+",";
            }else{
                allInfos += this.value[i];
            }
        }
        alert(allInfos);
        return allInfos += this.value[i]+",";;
    };
    
}

/*
	页面内查找(CTRL + F)

 */

function doZoom(size) {
	document.getElementById('zoom').style.fontSize = size + 'px';
}
var DOM = (document.getElementById) ? 1 : 0;
var NS4 = (document.layers) ? 1 : 0;
var IE4 = 0;
if (document.all) {
	IE4 = 1;
	DOM = 0;
}
var win = window;
var n = 0;

function findInPage(str) {
	var txt, i, found;
	if (str == "")
		return false;
	if (DOM) {
		win.find(str, false, true);
		return true;
	}
	if (NS4) {
		if (!win.find(str))
			while (win.find(str, false, true))
				n++;
		else
			n++;
		if (n == 0)
			alert("未找到指定内容.");
	}
	if (IE4) {
		txt = win.document.body.createTextRange();
		//查找第nextIndex个的字符串。之所以要用循环，是因为TextRange对象每次都是新生成的，所以查找初始位置每次都会还原。那么要查找第n次出现的字符串，就需要调用findText()方法多次，且每次查找都要重新设置开始位置和结束位置。
		for (i = 0; i <= n && (found = txt.findText(str)) != false; i++) {
			txt.moveStart("character", 1);
			txt.moveEnd("textedit");
		}
		//选中本次查找的字符串
		if (found) {
			//这里设置为-1，表示为倒序查找。之所以要这样做，是因为此时我们已经查找到了第nextIndex出现的字符串，那么此时如果设置为倒序查找，且将开始位置设置为末尾，那么此时调用findText()方法查找，则会刚好查到我们上一次查到的字符串 
			txt.moveStart("character", -1);
			txt.findText(str);
			txt.select();
			//滚动屏幕到合适位置  
			txt.scrollIntoView();
			n++;
		} else {
			if (n > 0) {
				n = 0;
				findInPage(str);
			} else
				alert("未找到指定内容.");
		}
	}
	return false;
}