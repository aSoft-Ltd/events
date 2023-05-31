@file:JsExport
@file:Suppress("NON_EXPORTABLE_TYPE")

package events

import kotlin.js.JsExport

@Deprecated("Use sanity now", replaceWith = ReplaceWith("EventBus","sanity.EventBus"))
abstract class EventBus {
    abstract fun <D> dispatch(event: Event<D>)
    abstract fun <D> subscribe(topic: String, callback: EventCallback<D>): Subscriber<D>
}