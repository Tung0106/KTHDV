document.addEventListener('DOMContentLoaded', function() {
	var path = window.location.pathname;
	var link_page = document.querySelectorAll('.link_page');

	link_page.forEach(function(item) {
		var attr = item.getAttribute('href');

		if (attr == path) {
			item.style.backgroundColor = '#D64646';
		}
	});
})