.class public final Lk/o;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/widget/PopupWindow$OnDismissListener;


# instance fields
.field public final synthetic a:Lk/q;


# direct methods
.method public constructor <init>(Lk/q;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk/o;->a:Lk/q;

    return-void
.end method


# virtual methods
.method public final onDismiss()V
    .locals 1

    iget-object v0, p0, Lk/o;->a:Lk/q;

    invoke-virtual {v0}, Lk/q;->c()V

    return-void
.end method
