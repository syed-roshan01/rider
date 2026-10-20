.class public final synthetic Lu1/n;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/ViewTreeObserver$OnScrollChangedListener;


# instance fields
.field public final synthetic a:Lu1/w;


# direct methods
.method public synthetic constructor <init>(Lu1/w;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu1/n;->a:Lu1/w;

    return-void
.end method


# virtual methods
.method public final onScrollChanged()V
    .locals 1

    iget-object v0, p0, Lu1/n;->a:Lu1/w;

    invoke-virtual {v0}, Lu1/w;->D()V

    return-void
.end method
