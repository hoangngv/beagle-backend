package com.vt.beaglebff.components.widgets

import br.com.zup.beagle.annotation.RegisterWidget
import br.com.zup.beagle.widget.Widget
import br.com.zup.beagle.widget.context.Bind

@RegisterWidget
class ItemRowDivider(val dividerColor: Bind<String>, val dividerHeight: Bind<Int>): Widget()