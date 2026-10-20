.class public final Landroidx/lifecycle/y0;
.super Ljava/lang/Object;

# interfaces
.implements Lq8/c;


# instance fields
.field public final a:Lj9/b;

.field public final b:Lc9/a;

.field public final c:Lc9/a;

.field public final d:Lc9/a;

.field public e:Landroidx/lifecycle/x0;


# direct methods
.method public constructor <init>(Ld9/e;Lc5/h;Lc5/h;Lu/r0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/lifecycle/y0;->a:Lj9/b;

    iput-object p2, p0, Landroidx/lifecycle/y0;->b:Lc9/a;

    iput-object p3, p0, Landroidx/lifecycle/y0;->c:Lc9/a;

    iput-object p4, p0, Landroidx/lifecycle/y0;->d:Lc9/a;

    return-void
.end method


# virtual methods
.method public final getValue()Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Landroidx/lifecycle/y0;->e:Landroidx/lifecycle/x0;

    if-nez v0, :cond_0

    iget-object v0, p0, Landroidx/lifecycle/y0;->c:Lc9/a;

    invoke-interface {v0}, Lc9/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/lifecycle/b1;

    iget-object v1, p0, Landroidx/lifecycle/y0;->b:Lc9/a;

    invoke-interface {v1}, Lc9/a;->invoke()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/lifecycle/f1;

    new-instance v2, Landroidx/lifecycle/e1;

    iget-object v3, p0, Landroidx/lifecycle/y0;->d:Lc9/a;

    invoke-interface {v3}, Lc9/a;->invoke()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lq3/c;

    invoke-direct {v2, v1, v0, v3}, Landroidx/lifecycle/e1;-><init>(Landroidx/lifecycle/f1;Landroidx/lifecycle/b1;Lq3/c;)V

    iget-object v0, p0, Landroidx/lifecycle/y0;->a:Lj9/b;

    const-string v1, "<this>"

    invoke-static {v0, v1}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ld9/d;

    invoke-interface {v0}, Ld9/d;->a()Ljava/lang/Class;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>"

    invoke-static {v0, v1}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Landroidx/lifecycle/e1;->a(Ljava/lang/Class;)Landroidx/lifecycle/x0;

    move-result-object v0

    iput-object v0, p0, Landroidx/lifecycle/y0;->e:Landroidx/lifecycle/x0;

    :cond_0
    return-object v0
.end method
