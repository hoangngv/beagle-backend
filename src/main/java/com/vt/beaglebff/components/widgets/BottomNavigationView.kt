package com.vt.beaglebff.components.widgets

import br.com.zup.beagle.annotation.RegisterWidget
import br.com.zup.beagle.widget.Widget

@RegisterWidget
class BottomNavigationView(val menuItems: ArrayList<Array<String>>): Widget()