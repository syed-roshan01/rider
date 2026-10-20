.class public final Lj0/c0;
.super Ljava/lang/Object;


# static fields
.field public static final a:Lj0/c0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lj0/c0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lj0/c0;->a:Lj0/c0;

    return-void
.end method


# virtual methods
.method public final a(Landroid/graphics/drawable/RippleDrawable;I)V
    .locals 0

    invoke-virtual {p1, p2}, Landroid/graphics/drawable/RippleDrawable;->setRadius(I)V

    return-void
.end method
