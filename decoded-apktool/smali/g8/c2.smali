.class public final Lg8/c2;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lg8/o0;

.field public final synthetic b:Z

.field public final synthetic c:Lg8/j2;


# direct methods
.method public constructor <init>(Lg8/j2;Lg8/o0;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg8/c2;->c:Lg8/j2;

    iput-object p2, p0, Lg8/c2;->a:Lg8/o0;

    iput-boolean p3, p0, Lg8/c2;->b:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lg8/c2;->c:Lg8/j2;

    iget-object v0, v0, Lg8/j2;->t:Lg8/z1;

    iget-object v1, p0, Lg8/c2;->a:Lg8/o0;

    iget-boolean v2, p0, Lg8/c2;->b:Z

    invoke-virtual {v0, v1, v2}, Lf4/y;->f(Ljava/lang/Object;Z)V

    return-void
.end method
