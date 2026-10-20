.class public final Lg8/e5;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lg8/f5;


# direct methods
.method public synthetic constructor <init>(Lg8/f5;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lg8/e5;->a:I

    iput-object p1, p0, Lg8/e5;->b:Lg8/f5;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget v0, p0, Lg8/e5;->a:I

    iget-object v1, p0, Lg8/e5;->b:Lg8/f5;

    packed-switch v0, :pswitch_data_0

    iget-object v0, v1, Lg8/f5;->b:Lg8/y2;

    iget-boolean v1, v0, Lg8/y2;->z:Z

    if-nez v1, :cond_0

    iget-object v0, v0, Lg8/y2;->u:Lg8/j0;

    invoke-interface {v0}, Lg8/b6;->b()V

    :cond_0
    return-void

    :pswitch_0
    iget-object v0, v1, Lg8/f5;->b:Lg8/y2;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lg8/y2;->z:Z

    iget-object v1, v0, Lg8/y2;->u:Lg8/j0;

    iget-object v0, v0, Lg8/y2;->s:Ll/z2;

    iget-object v2, v0, Ll/z2;->b:Ljava/lang/Object;

    check-cast v2, Le8/c2;

    iget-object v3, v0, Ll/z2;->c:Ljava/lang/Object;

    check-cast v3, Lg8/i0;

    iget-object v0, v0, Ll/z2;->d:Ljava/lang/Object;

    check-cast v0, Le8/l1;

    invoke-interface {v1, v2, v3, v0}, Lg8/j0;->c(Le8/c2;Lg8/i0;Le8/l1;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
