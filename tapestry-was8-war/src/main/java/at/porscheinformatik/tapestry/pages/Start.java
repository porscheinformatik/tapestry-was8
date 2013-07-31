package at.porscheinformatik.tapestry.pages;

import org.apache.tapestry5.ioc.annotations.Inject;

import org.apache.tapestry5.annotations.Component;
import org.apache.tapestry5.corelib.components.ActionLink;
import org.apache.tapestry5.services.PageRenderLinkSource;

import at.porscheinformatik.tapestry.components.Layout;
import at.porscheinformatik.tapestry.pages.form.FormWithDiscarding;
import at.porscheinformatik.tapestry.pages.form.FormWithPageRefresh;
import at.porscheinformatik.tapestry.pages.form.FormWithSessionState;
import at.porscheinformatik.tapestry.pages.passivate.ActivatePassivateDemo;
import at.porscheinformatik.tapestry.pages.resultprocessor.PageResultProcessorDemo;

public class Start
{
    @Component
    private Layout layout;

    @Component
    private ActionLink activatePassivateLink;

    @Component
    private ActionLink activatePassivateLinkWithContext;

    @Component
    private ActionLink formHandlingPageRefresh;

    @Component
    private ActionLink formHandlingDiscard;

    @Component
    private ActionLink resultProcessor;

    @Component
    private ActionLink formHandlingSessionState;
    
    @Inject
    private PageRenderLinkSource pageRenderLinkSource;

    Object onActionFromActivatePassivateLink()
    {
        return ActivatePassivateDemo.class;
    }

    Object onActionFromActivatePassivateLinkWithContext()
    {
        return pageRenderLinkSource.createPageRenderLinkWithContext(ActivatePassivateDemo.class,
            System.currentTimeMillis());
    }

    Object onActionFromResultProcessor()
    {
        return PageResultProcessorDemo.class;
    }

    Object onActionFromFormHandlingPageRefresh()
    {
        return FormWithPageRefresh.class;
    }

    Object onActionFromFormHandlingDiscard()
    {
        return FormWithDiscarding.class;
    }

    Object onActionFromFormHandlingSessionState()
    {
        return FormWithSessionState.class;
    }
}
