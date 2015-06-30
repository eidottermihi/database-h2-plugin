package org.jenkinsci.plugins.database.h2.LocalH2Database

def f = namespace(lib.FormTagLib)

f.entry(field:"path",title:_("File Path")) {
    f.textbox()
}
f.advanced() {
    f.entry(field:"autoServer",title:_("Use Automatic Mixed Mode")) {
        f.checkbox()
    }
}