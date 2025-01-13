document.addEventListener('DOMContentLoaded', function() {
	var btn_add_product = document.getElementById('btn_add_product');
	var btn_edit = document.querySelectorAll('.btn_edit');
	var btn_delete = document.querySelectorAll('.btn_delete');

	var model_add_product = document.getElementById('model_add_product');
	var btn_close_model_add = document.getElementById('btn_close_model_add');

	var model_update_quantity = document.getElementById('model_update_quantity');
	var btn_close_model_update = document.getElementById('btn_close_model_update');

	btn_edit.forEach(function(item) {
		item.addEventListener('click', function() {
			model_update_quantity.classList.add('show_model');
		})
	})

	btn_add_product.addEventListener('click', function() {
		model_add_product.classList.add('show_model');
	})

	btn_close_model_add.addEventListener('click', function() {
		model_add_product.classList.remove('show_model');
	})
	
	btn_close_model_update.addEventListener('click', function(){
		model_update_quantity.classList.remove('show_model');
	})
})