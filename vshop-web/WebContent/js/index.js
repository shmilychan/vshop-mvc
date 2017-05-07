$(function() {
	
	$.get("item.json",{},function(data){
		for (x = 0 ; x < data.items.length ; x ++){
			itemData = 
				"<div class='panel panel-primary'>" +
				"		<div class='panel-heading'>" + 
				"			<h4 class='panel-title'>" +
				"				<a data-toggle='collapse' data-parent='#item' href='#content-"+data.items[x].item.iid+"'>" + 
				"					" + data.items[x].item.title +
				"				</a>" +
				"			</h4>" +
				"		</div>" +
				"		<div id='content-"+data.items[x].item.iid+"' class='panel-collapse collapse "+(x == 0 ? "in" : "")+"'>" +
				"			<div class='panel-body'>" +
				"				<div class='row'>"  ;
			for (y = 0 ; y < data.items[x].subitems.length ; y ++) {
				itemData += "<div class='col-md-4'><a href='pages/front/goods/GoodsActionFront!list.action?sid="+data.items[x].subitems[y].sid+"'>"+data.items[x].subitems[y].title+"</a></div>" ;
			}
			itemData += 
				"				</div>" +
				"			</div>" +
				"		</div>" +
				"	</div>" ;
			$(item).append(itemData) ;
		}
	},"json") ;

}) 